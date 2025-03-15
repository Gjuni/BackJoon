/**
 *  문제 이름 : 30
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : 수가 주어지면 30으로 만들 수 있는 최대의 수로 만들어라.
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
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        
        String string = input.readLine();

        boolean result = false;

        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            int current_num = string.charAt(i)-'0';
            answer += current_num;
            list.add(current_num);

            if(current_num == 0) {
                result = true;
            }
        }

        Collections.sort(list);

        if(answer%3 == 0 && result) {
            for(int i = list.size()-1; i >= 0; i--) {
                output.write(String.valueOf(list.get(i)));
            }
        } else {
            output.write(String.valueOf(-1));
        }

        

        input.close();
        output.close();
    }
}