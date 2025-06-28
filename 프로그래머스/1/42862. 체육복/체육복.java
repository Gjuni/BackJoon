import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
            
        ArrayList<Integer> lost_list = new ArrayList<>();
        ArrayList<Integer> reserve_list = new ArrayList<>();
        
        for(int l : lost) {
            boolean check = false;
            
            for(int r : reserve) {
                if(l == r){
                    check = true;
                } 
            }
            
            if(!check) lost_list.add(l);
        }
        
        for(int r : reserve) {  
            boolean check = false;
            
            for(int l : lost) {
                if(l == r){
                    check = true;
                } 
            }
            
            if(!check) reserve_list.add(r);
        }
        
        answer = n - lost_list.size();
        
        for(int i = 0; i < reserve_list.size(); i++) {
            int cur_num = reserve_list.get(i);
            
            if(lost_list.contains(cur_num-1)) {
                lost_list.remove(Integer.valueOf(cur_num-1));
                answer++;
            } else if(lost_list.contains(cur_num+1)) {
                lost_list.remove(Integer.valueOf(cur_num+1));
                answer++;
            }
        }
        
        return answer;
    }
}