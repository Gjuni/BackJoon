import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public class my_stack {
        int size;
        int top;
        int[] stack;

        public my_stack(int size) {
            this.size = size;
            top = -1;
            stack = new int[size];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
        public boolean isFull() {
            return (top == stack.length-1);
        }
        public void push(int item) {
            if(isFull()) {
                return;
            }
            stack[++top] = item;
        }
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int value = stack[top--];
            this.size--;
            return value;
        }
        public int size() {
            return top+1;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat_num = Integer.parseInt(input.readLine());
        Main rc = new Main();
        my_stack stack = rc.new my_stack(repeat_num);

        for(int i =0; i< repeat_num; i++) {
            int num = Integer.parseInt(input.readLine());

            if(num != 0) {
                stack.push(num);
            } else if(num == 0) {
                stack.pop();
            }
        }
        int total =0;
        while(!stack.isEmpty()) {
            total += stack.pop();
        }
        output.write(String.valueOf(total));
        output.flush();
        output.close();
        input.close();
    }
}
