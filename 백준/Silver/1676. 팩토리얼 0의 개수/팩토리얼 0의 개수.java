/**
 *  문제 이름 : 팩토리얼 0의 개수
 * 
 *  난 이  도 : 실버 5
 * 
 *  아이디어 : N!의 0의 갯수를 구하여라
 * 
 *  해    설 : x0이나 x00의 갯수를 세는 줄 알았으나
 *              10은 2와 5로 만들어짐 즉 2나 5의 갯수를 세면 되지만
 *              2는 무조건 5보다 많기 때문에 5의 갯수를 세면 된다.
 *          -> 틀림
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

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        int answer = 0;

        for(int i = 1; i<= num; i++) {
            int index = 0;
            int temp = i;

            while (temp >= 5) {
                if(temp %5 == 0) {
                    temp /= 5;
                    index++;
                } else {
                    break;
                }
            }

            answer += index;
        }
        output.write(String.valueOf(answer));

        input.close();
        output.close();
    }
}
