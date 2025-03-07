/**
 *  문제 이름 : 키로거
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 입력한 순서대로 길이가 L이 문자열이 주어진다.
 *             백스페이스를 입력했다면 '-'가 주어지고 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다.
 *              
 *             화살표의 입력은 <와 >로 주어진다.
 *             이때 커서의 위치를 움직일 수 있다면 왼쪽 또는 오른쪽으로 1만큼 움직인다.
 *              
 *              나머지 문자는 비밀번호의 일부이다.             
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

  /* a<b<c<d>>e
     오답 : dabec
     정답 : dcbea

     d c b e a
   */
    public static StringBuilder solved(String string) {
        StringBuilder answer = new StringBuilder();

        Stack<Character> left_stack = new Stack<>();
        Stack<Character> right_queue = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char current_char = string.charAt(i);

            if(current_char == '<') { // 왼쪽에서 오른쪽
                if(!left_stack.isEmpty()) {
                    right_queue.push(left_stack.pop());
                }
            } else if(current_char == '>') { // 오른쪽에서 왼쪽
                if(!right_queue.isEmpty()) {
                    left_stack.push(right_queue.pop());
                }
            } else if(current_char == '-') {
                if(!left_stack.isEmpty()) {
                    left_stack.pop();
                }
            } else {
                left_stack.add(current_char);
            }
        }
        Stack<Character> temp_stack = new Stack<>();
        
        while(!left_stack.isEmpty()) {
            temp_stack.add(left_stack.pop());
        }

        while (true) { 
            if(!temp_stack.isEmpty()) {
                answer.append(temp_stack.pop());
            } else {
                answer.append(right_queue.pop());
            }

            if(temp_stack.isEmpty() && right_queue.isEmpty()) {
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat_num = Integer.parseInt(input.readLine());

        for (int i = 0; i < repeat_num; i++) {
            String string = input.readLine();

            output.write(solved(string)+"\n");
        }

        input.close();
        output.close();
    }
}
