/**
 *  문제 이름 : 유기농 배추
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;
    static int width;
    static int height;

    public static void solve(int[][] arr, int w, int h) {
        if((height > h && h >= 0) && (width > w && w >= 0)) {
            if(arr[h][w] == 1) {
                arr[h][w] = 0;
                solve(arr, w+1, h);
                solve(arr, w-1, h);
                solve(arr, w, h+1);
                solve(arr, w, h-1);
            }
        }
    }


    public static void add_graph(int [][]arr, int x, int y) {
        arr[y][x] = 1;
    }

    public static void main(String[] args) throws IOException { 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        for (int i = 0; i < repeat_num; i++) {
            answer = 0;
            StringTokenizer token = new StringTokenizer(input.readLine());

            width = Integer.parseInt(token.nextToken());
            height = Integer.parseInt(token.nextToken());
            int total_bechu = Integer.parseInt(token.nextToken());

            int arr[][] = new int[height][width];

            for (int j = 0; j < total_bechu; j++) {
                token = new StringTokenizer(input.readLine());

                int x = Integer.parseInt(token.nextToken());
                int y = Integer.parseInt(token.nextToken());
                
                add_graph(arr, x, y);
            }


            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    if(arr[h][w] == 1) {
                        solve(arr, w, h);
                        answer++;
                    }
                }
            }

            output.write(String.valueOf(answer)+"\n");
        }

        input.close();
        output.close();
    }
}
