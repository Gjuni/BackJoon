import java.util.*;

class Solution {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    static int[] answer;
    
    public static void BFS(int n) {
        visit[n] = true;
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        queue.add(n);
        
        while(!queue.isEmpty()) {
            int cur_node = queue.poll();
                
            for(int next : graph.get(cur_node)) {
                if(!visit[next]) {
                    visit[next] = true;
                    answer[next] = answer[cur_node] +1;
                    queue.add(next);
                }
            }
        
        
        }
    }
    
    public int solution(int n, int[][] edge) {
        
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        visit = new boolean[n+1];
        answer = new int[n+1];
        
        for(int i = 0 ; i< edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        BFS(1);
        
        int max_length = 0;
        for(int i = 1; i <= n; i++) {
            max_length = Math.max(answer[i], max_length);
        }
        
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(answer[i] == max_length) {
                count ++;
            }
        }
        
        return count;
    }
}