import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


class Main {
    static boolean visit[];
    static int result = 0;
    public static void putEdge(int[][] graph, int x, int y) {
        graph[x][y] =1;
        graph[y][x] =1;
    }

    public static int print_edge(int[][] graph,int start, int vertax) {
        visit[start] = true;

        for(int i = 1; i <= vertax; i++) {
            if(graph[start][i] == 1 && visit[i] == false) {
                result++;
                print_edge(graph, i, vertax);
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int vertax = Integer.parseInt(input.readLine());
        int node = Integer.parseInt(input.readLine());
        
        int[][] graph = new int[vertax+1][vertax+1];
        visit = new boolean[vertax+1];

        for(int i =0; i< node; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());

            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            putEdge(graph, x, y);
        }
        output.write(String.valueOf(print_edge(graph,1,vertax)));
        input.close();
        output.flush();
        output.close();
    }
}
