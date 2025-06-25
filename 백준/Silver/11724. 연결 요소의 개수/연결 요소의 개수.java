import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] graph;
    static boolean[] visit;
    static int answer = 0;
    
    public static void solve(int num)  {
        visit[num] = true;

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(num);

        while(!queue.isEmpty()) {
            int curNum = queue.poll();

            for (int i = 1; i < graph[curNum].length; i++) {
                if(graph[curNum][i] == 1 && visit[i] == false) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }


    public static void main(String argc[]) throws IOException{
        StringTokenizer token = new StringTokenizer(input.readLine());

        int node = Integer.parseInt(token.nextToken());
        int vector = Integer.parseInt(token.nextToken());

        graph = new int[node+1][node+1];
        visit = new boolean[node+1];

        for (int i = 0; i < vector; i++) {  
            token = new StringTokenizer(input.readLine());

            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            graph[y][x] = 1;
            graph[x][y] = 1;
        }

        for (int i = 1; i <= node; i++) {
            if(visit[i] == false) {
                solve(i);
                answer++;
            }
        }

        output.write(String.valueOf(answer));

        input.close();
        output.close();
    }
}
