/**
 *  문제 이름 : 참외밭
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 참외의 갯수를 구하시오 (사실 상 면적 구하기 문제제)
 *            1: 동쪽, 2: 서쪽, 3: 남쪽, 4: 북쪽
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
    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int fruits = Integer.parseInt(input.readLine());

        int array[] = new int[6];
        int side_array[] = new int[6];
        
        int max_height = 0;
        int max_height_index = 0;
        int max_weight = 0;
        int max_weight_index = 0;

        for(int i =0; i< 6; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());

            side_array[i] = Integer.parseInt(token.nextToken());
            array[i] = Integer.parseInt(token.nextToken());

            if(side_array[i] == 1 || side_array[i] == 2) {                
                if(max_height < array[i]) {
                    max_height = array[i];
                    max_height_index = i;
                }
            } else {
                if(max_weight < array[i]) {
                    max_weight = array[i];
                    max_weight_index = i;
                }
            }
        }

        int min_weight = Math.abs(array[(max_height_index+1)%6] - array[(max_height_index+5)%6]);
        int min_height = Math.abs(array[(max_weight_index+1)%6] - array[(max_weight_index+5)%6]);

        int result = (max_height * max_weight) - (min_height * min_weight);

        output.write(String.valueOf(result*fruits));

        input.close();
        output.close();
    }
}
