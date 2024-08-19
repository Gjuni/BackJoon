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

        Stack<Integer> stack = new Stack<>();
        StringBuilder string = new StringBuilder();
        int test_case = Integer.parseInt(input.readLine());
        int num_array[] = new int[test_case];
        int idx = 1;
        boolean check = true;

        for(int i =0; i< test_case; i++) {
            num_array[i] = Integer.parseInt(input.readLine());

            while(idx <= num_array[i]) {
                stack.push(idx++);
                string.append("+");
            }

            if (stack.peek() == num_array[i]) {
                stack.pop();
                string.append("-");
            } else {
                check = false;
                break;
            }
        }

        if(!check) {
            output.write("NO");
        } else {
            for(int i =0; i< string.length(); i++) {
                output.write(string.charAt(i)+"\n");
            }
        }

        input.close();
        output.flush();
        output.close();
    }
}
