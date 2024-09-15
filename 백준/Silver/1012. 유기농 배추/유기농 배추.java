import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    static int height;
    static int weight;
    public static void add(int[][] graph ,int x, int y) {
        graph[x][y] = 1;
    }

    public static void result(int[][] graph, int h, int w){
        if((h >= 0 && height > h) && (w >= 0 && weight > w) && graph[h][w]==1) {
            graph[h][w] = 0;
            result(graph, h+1, w);
            result(graph, h-1, w);
            result(graph, h, w+1);
            result(graph, h, w-1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token1 = new StringTokenizer(input.readLine());

            height = Integer.parseInt(token1.nextToken());
            weight = Integer.parseInt(token1.nextToken());
            int node = Integer.parseInt(token1.nextToken());

            int graph[][] = new int[height][weight];

            for(int j =0; j< node; j++) {
                StringTokenizer xy = new StringTokenizer(input.readLine());

                int x = Integer.parseInt(xy.nextToken());
                int y = Integer.parseInt(xy.nextToken());

                add(graph, x, y);
            }   
            int count = 0;

            for(int h =0; h< height; h++) {
                for(int w = 0; w < weight; w++) {
                    if(graph[h][w] == 1) {
                        result(graph, h, w);
                        count++;
                    }
                }
            }
            output.write(String.valueOf(count));

            if(i < repeat_num-1) {
                output.write("\n");
            }
        }

        input.close();
        output.flush();
        output.close();
    }
}
