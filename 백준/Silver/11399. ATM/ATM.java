/**
 *  문제 이름 : ATM
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : ATM 돈을 뽑은 시간을 최소화한 시간을 출력해라라
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
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());

        int[] array = new int[num];
        StringTokenizer token = new StringTokenizer(input.readLine());

        for(int i =0; i< num; i++) {
            array[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(array);

        for(int i =1; i < num; i++) {
            array[i] += array[i-1];
        }

        int answer = 0;

        for(int i =0; i< num; i++) {
            answer += array[i];
        }

        output.write(String.valueOf(answer));

        input.close();
        output.close();
    }
}
