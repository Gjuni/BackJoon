import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static String solved(String parthenes) {

        Stack<Character> stack = new Stack<>();

        for(int i =0; i< parthenes.length(); i++) {
            char sepaerate = parthenes.charAt(i);

            if(sepaerate == '(') {
                stack.add(sepaerate);
            } else if (sepaerate == ')') {
                
                if(stack.isEmpty()) {
                    return "NO";
                } else {
                    char temp_char = stack.peek();

                    if(temp_char == '(') {
                        stack.pop();
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());

        for(int i =0; i< num; i++) {
            String parthenes = input.readLine();

            output.write(solved(parthenes)+"\n");
        }

        input.close();
        output.close();
    }
}
