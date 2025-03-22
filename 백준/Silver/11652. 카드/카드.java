/**
 *  문제 이름 : 카드
 * 
 *  난 이  도 : 카드를 N 장 가지고 있다.
 *              문제는 적힌 수가 -2^62에서 2^26이다..
 *              
 *              가지고 있는 카드가 주어졌을 때, 가지고 있는 정수를 구하는 프로그램을 작성하시오.
 *              만약 가장 많이 가지고 있는 정수가 여러 가지라면 작은 것을 출력하시오.
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

import java.io.*;
import java.util.HashMap;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String argc[]) throws IOException {
        
        int N = Integer.parseInt(input.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Long s = Long.parseLong(input.readLine());

            int num = map.getOrDefault(s, 0);

            map.put(s, num+1);
        }

        int count = 0;
        Long answer = Long.MAX_VALUE;

        for(Long key : map.keySet()) {
            int current_num = map.get(key);

            if(count < current_num || (count == current_num && answer > key)) {
                    count = current_num;
                    answer = key;
            }
        }

        output.write(String.valueOf(answer));

        input.close();
        output.close();
    }

}
