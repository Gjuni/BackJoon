import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
            
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i< participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) +1);
        }
        
        for(String name : completion) {
            if(map.containsKey(name)) {
                int num = map.get(name);
                
                map.replace(name, num-1);
            }
        }
        
        for(String name : participant) {
            if(map.get(name) > 0)     {
                answer = name;
            }
        }
        
        return answer;
    }
}