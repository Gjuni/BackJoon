import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        
        for(int i =0; i < repeat_num; i++) {
            String parenthes = input.readLine();
            Stack<Character> stack = new Stack<>();
            boolean canornot = true;

            for(int j =0; j < parenthes.length(); j++) {
                char ch = parenthes.charAt(j); // 한글자씩 읽어들임
                
                if(ch == '(') {
                    stack.push(ch);
                } else if(ch == ')') {
                    if(stack.empty()) {
                        canornot = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(!stack.empty()) {
                canornot = false;
            }

            if(canornot) {
                output.write("YES\n");
            } else {
                output.write("NO\n");
            }
        }
        output.flush();
        output.close();
        input.close();
    }
}
