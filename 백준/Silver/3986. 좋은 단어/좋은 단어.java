/**
 *  문제 이름 : 좋은 단어
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : 아치 형태로 사라지면 좋은단어이다.
 *              A는 A끼리 B는 B끼리 쌍을 짓는다.
 *              선끼리 교차하지 않으면서 각 글자를 정확히 한 개의 다른 위치에 있는 같은 글자와 짝 지을 수 있다면
 *              좋은 단어.
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
import java.util.Stack;

public class Main {

    // ABABAABABA
    public static boolean solved(String string) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < string.length(); i++) {
            char current_char = string.charAt(i);

            if(stack.isEmpty()) {
                stack.push(current_char);    
            } else {
                char temp_char = stack.peek(); // 확인만

                if(temp_char == current_char) {
                    stack.pop();
                } else {
                    stack.push(current_char);
                }
            }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());

        int answer = 0;

        for (int i = 0; i < num; i++) {
            String string = input.readLine();

            if(solved(string)) {
                answer++;
            }
        }

        output.write(String.valueOf(answer));

        input.close();
        output.close();
    }
}
