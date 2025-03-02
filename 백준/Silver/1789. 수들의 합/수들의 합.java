/**
 *  문제 이름 : 수들의 합
 * 
 *  난 이  도 : 실버 5
 * 
 *  아이디어 : 서로 다른 N개의 자연수의 합을 S라고 함
 *              S를 알 때, 자연수 N의 최댓값은?
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

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(input.readLine());

        int idx = 0;
        long added_num = 0;

        while(added_num <= num) {
            ++idx;
            added_num += idx;
        }

        if(added_num == num) {
            output.write(String.valueOf(idx));
        } else {
            output.write(String.valueOf(idx-1));
        }


        input.close();
        output.close();
    }
}
