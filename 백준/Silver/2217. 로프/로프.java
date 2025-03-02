/**
 *  문제 이름 : 로프
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : 각각의 로프가 병렬연결되어 무게를 분산시킨다. 로프는 전부 사용하지 않아도 된다.
 *              이때 최대로 들 수 있는 무게를 구하라
 *              
 *              w(무게) / k(로프 갯수) = max_weight
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
import java.util.Comparator;

public class Main {
    public static int solve(Integer[] rope_array) {
        int current_weight = 0;
        int answer = 0; // max_weight
        
        for(int i =0; i < rope_array.length; i++) {
            current_weight = rope_array[i]*(i+1);

            if(current_weight > answer) {
                answer = current_weight;
            }
        }
        return answer;
    }

    public static void main(String argc[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int rope_count = Integer.parseInt(input.readLine());

        Integer rope_array[] = new Integer[rope_count];

        for(int i = 0; i< rope_count; i++) {
            rope_array[i] = Integer.parseInt(input.readLine());
        }

        Arrays.sort(rope_array, Comparator.reverseOrder()); // 정렬하여 가장 무거운 무게를 지탱할 수 있는 값을 받아옴옴

        output.write(String.valueOf(solve(rope_array)));

        input.close();
        output.close();
    }
}
