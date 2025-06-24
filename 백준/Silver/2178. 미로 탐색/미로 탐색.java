/**
 *  문제 이름 : 미로 탐색
 * 
 *  난 이  도 : 실버 1
 * 
 *  아이디어 : 
 *              미로 1은 이동할 수 이쓴ㄴ 칸을 나타내고 0은 이동할 수 없는 칸을 나타낸다.
 *              칸은 인접한 칸으로만 이동할 수 있다.
 * 
 *              (n,m)이 주어졌을 때 n,m까지 가는 최소 칸의 갯수는?
 * 
 *  해    설 : 
 *              처음에 DFS 재귀로 풀려고 했다. 다만 최소 거리를 구하는 방법에서 문제점이 생겼다.
 *              대소 비교가 불가능하였기에 알고리즘을 보았더니 BFS로 풀어야한다고 나와있어
 * 
 *              BFS로 0,0 부터 시작하면서 Queue에는 배열의 x, y를 삽입한다.
 *              Queue를 Poll하면서 현재 x, y좌표를 가져온다.
 *          
 *              다음 next x, y 좌표에서는 for문으로 x-1 x+1 y-1 y+1 값들을 넣으면서
 *              범위와 graph에의 값이 1인지 확인하고 이미 방문했는지도 확인하게 만든다.
 *          
 *              이때 전잔하면서 그 칸의 수를 다음 칸에 삽입한다.
 *              최종적으로는 n,m의 graph 좌표의 값이 최솟값이기 때문에 출력해준다.
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] graph;
    static boolean[][] visit;
    static int answer = 0;

    static int[] direct_x = {-1, 1, 0, 0};
    static int[] direct_y = {0, 0, -1, +1};

    static Queue<int[]> queue = new ArrayDeque<>();
    
    public static void BFS(int x, int y) {
        visit[y][x] = true;

        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int cur[] = queue.poll();
            int cur_x = cur[0];
            int cur_y = cur[1];

            for (int i = 0; i < 4; i++) {
                int next_x = cur_x + direct_x[i];
                int next_y = cur_y + direct_y[i];
                
                if((next_x >= 0 && next_y >= 0) && (next_x < graph[0].length && next_y < graph.length)) {
                    if(!visit[next_y][next_x] && graph[next_y][next_x] == 1) {
                        graph[next_y][next_x] = graph[cur_y][cur_x]+1;

                        queue.add(new int[] {next_x, next_y});
                        visit[cur_y][cur_x] = true;
                    }    
                }
            }

        }
    }

    public static void main(String[] argc) throws IOException {
        StringTokenizer token = new StringTokenizer(input.readLine());

        int y = Integer.parseInt(token.nextToken());
        int x = Integer.parseInt(token.nextToken());

        graph = new int[y][x];
        visit = new boolean[y][x];

        for (int i = 0; i < y; i++) {
            String string = input.readLine();

            for (int j = 0; j < x; j++) {
                graph[i][j] = string.charAt(j) - '0';
            }
        }

        BFS(0,0);
        output.write(String.valueOf(graph[y-1][x-1]));

        input.close();
        output.close();
    }
}