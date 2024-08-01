import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public class IntStack {
        int top;
        int size;
        int[] stack;

        public IntStack(int size) {
            this.size = size;
            stack = new int[size];
            top = -1;
        }
        public boolean isFull() {
            return (top == stack.length-1);
        }

        public boolean isEmpty() {
            return (top == -1);
        }
        public int top() {
            if(isEmpty()) {
                return -1;
            }
            return stack[top];
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
            return stack[top--];
        }
        public int size() {
            return top+1;
        }  
        public int empty() {
            return isEmpty() ? 1 : 0;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int repeat_num = Integer.parseInt(input.readLine());
        Main br = new Main();
        IntStack stack = br.new IntStack(repeat_num);

        for(int i =0; i< repeat_num; i++) {
            String commad = input.readLine();

            if(commad.startsWith("push")) {
                int item = Integer.parseInt(commad.split(" ")[1]);
                stack.push(item);
            } else if(commad.equals("pop")) {
                System.out.println(stack.pop());
            } else if(commad.equals("top")) {
                System.out.println(stack.top());
            } else if(commad.equals("size")) {
                System.out.println(stack.size());
            } else if(commad.equals("empty")) {
                System.out.println(stack.empty());
            }
        }

        input.close();
    }
}