import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i =0; i< repeat_num; i++) {
            String string = input.readLine();

            for(int j = 0; j< string.length(); j++) {
                char each_char = string.charAt(j);

                if(stack.isEmpty()) {
                    stack.push(each_char);
                } else {
                    if(stack.peek().equals(each_char)) {
                        stack.pop();
                    } else {
                        stack.push(each_char);
                    }
                }
            }
            if(stack.isEmpty()) {
                count++;
                stack.clear();
            } else {
                stack.clear();
            }
        }

        output.write(String.valueOf(count));
        input.close();
        output.flush();
        output.close();
    }
}
