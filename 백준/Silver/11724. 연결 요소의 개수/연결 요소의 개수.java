import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    static boolean check[];
    public static void add(int[][] graph, int x, int y) {
        graph[x][y] = 1;
        graph[y][x] = 1;
    }

    public static void node_count(int[][] graph, int start, int vertax) {
        if(check[start]) {
            return;
        } else {
            check[start] = true;

            for(int i =1; i<= vertax; i++) {
                if(graph[start][i] == 1) {
                    node_count(graph, i, vertax);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer repeat = new StringTokenizer(input.readLine());
        int vertax = Integer.parseInt(repeat.nextToken());
        int node = Integer.parseInt(repeat.nextToken());

        int graph[][] = new int[vertax+1][vertax+1];
        check = new boolean[vertax+1];

        for(int i =0; i< node; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());

            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            add(graph, x, y);
        }
        int answer = 0;
        for(int i =1; i<= vertax; i++) {
            if(!check[i]) {
                node_count(graph, i, vertax);
                answer++;
            }
        }
        output.write(String.valueOf(answer));
        input.close();
        output.flush();
        output.close();
    }
}
