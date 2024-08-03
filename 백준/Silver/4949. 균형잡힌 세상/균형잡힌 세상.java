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
        
        while(true){
            Stack<Character> stack = new Stack<>();
            String nextLine = input.readLine();
            
            if(nextLine.equals(".")) {
                break;
            }
            boolean check = true;

            for(int i =0;i < nextLine.length(); i++)
            {
                char world = nextLine.charAt(i);
                if(world== '(' || world == '[') {
                    stack.push(world);
                } else if(world == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        check = false;
                        break;
                    }
                } else if(world == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        check = false;
                        break;
                    }
                }
            } 
            if(check && stack.isEmpty()) {
                output.write("yes\n");
            } else {
                output.write("no\n");
            }
        }
    
        output.flush();
        output.close();
        input.close();
    }
}

