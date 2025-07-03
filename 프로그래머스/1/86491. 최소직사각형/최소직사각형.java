import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int total_right_num = 0;
        int total_left_num = 0;
        
        int cur_right = 0;
        int cur_left = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int num1 = sizes[i][0]; // 왼쪽
            int num2 = sizes[i][1]; // 오른쪽
            
            if(num1 >= num2) {
                cur_right = num1;
                cur_left = num2;
            } else {
                cur_right = num2;
                cur_left = num1;
            }
            
            total_right_num = Math.max(total_right_num, cur_right);
            total_left_num = Math.max(total_left_num, cur_left);
        }
        answer = total_right_num * total_left_num;
        
        return answer;
    }
}