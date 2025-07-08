import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }
        
        while(q.size() >= 2 && q.peek() < K) {
            int num1 = q.poll();
            int num2 = q.poll();
                
            int new_num = num1 + (num2*2);
                
            q.add(new_num);
            answer++;
        }
        
        if(q.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}