import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> temp_answer = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int s = commands[i][0];
            int e = commands[i][1];
            int select = commands[i][2];
            
            int[] temp_array = new int[e-s+1];
            int index = 0;
            
            for(int j = s-1; j < e; j++) {
                temp_array[index++] = array[j];
            }
            
            Arrays.sort(temp_array);
            
            temp_answer.add(temp_array[select-1]);
        }
        
        int index = 0;
        for(int i : temp_answer) {
            answer[index++] = i;
        }
        
        return answer;
    }
}