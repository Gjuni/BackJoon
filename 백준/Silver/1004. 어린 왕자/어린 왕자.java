/**
 *  문제 이름 : 어린 왕자
 * 
 *  난 이  도 : 실버 3
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
    public static void main(String argc[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
    
            // 출발점 (x1, y1), (x2, y2)
            int start_x1 = Integer.parseInt(token.nextToken());
            int start_y1 = Integer.parseInt(token.nextToken());
            int start_x2 = Integer.parseInt(token.nextToken());
            int start_y2 = Integer.parseInt(token.nextToken());
    
            // 행성 갯수
            int planet_num = Integer.parseInt(input.readLine());

            int answer = 0;

            for(int j = 0; j < planet_num; j++) {
                token = new StringTokenizer(input.readLine());

                int planet_x = Integer.parseInt(token.nextToken());
                int planet_y = Integer.parseInt(token.nextToken());
                int round_range = Integer.parseInt(token.nextToken());

                int dist_start_x1 = (int)Math.pow(start_x1-planet_x, 2);
                int dist_start_y1 = (int)Math.pow(start_y1-planet_y, 2);

                int dist_start_x2 = (int)Math.pow(start_x2-planet_x, 2);
                int dist_start_y2 = (int)Math.pow(start_y2-planet_y, 2);

                if(dist_start_x1 + dist_start_y1 < round_range*round_range) {
                    answer++;
                } else if(dist_start_x2 + dist_start_y2 < round_range * round_range) {
                    answer++;
                }

                if((dist_start_x1 + dist_start_y1 < round_range*round_range) && (dist_start_x2 + dist_start_y2 < round_range * round_range)) {
                    answer--;
                }

            }

            output.write(String.valueOf(answer) +"\n");
        }


        input.close();
        output.close();
    }
}
