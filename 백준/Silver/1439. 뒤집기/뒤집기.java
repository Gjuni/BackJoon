/**
 *  문제 이름 : 뒤집기
 * 
 *  난 이  도 : 실버 5
 * 
 *  아이디어 : 101001 을 봤을 때 같은 수로 만들 수 있는 최소한의 횟수를 구하여라
 *              2가 될 것이다. 
 * 
 *  해    설 : f
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */

import java.io.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String argc[]) throws IOException{

        String string = input.readLine();

        int zero_flip_count = 0;
        int one_filp_count = 0;


        char added = string.charAt(0);
        if(added == '0') {
            one_filp_count++;
        } else if(added == '1') {
            zero_flip_count++;
        }

        for(int i =1; i< string.length(); i++) {
            char before_num = string.charAt(i-1); // 처음 char값을 읽음
            char current_char = string.charAt(i);

            if(before_num != current_char) {
                if (current_char == '0') {
                    one_filp_count ++;
                } else {
                    zero_flip_count ++;
                }
            }

        }   
        
        
        output.write(String.valueOf(Math.min(one_filp_count, zero_flip_count)));

        input.close();
        output.close();
    }
}
