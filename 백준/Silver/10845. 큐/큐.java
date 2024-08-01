import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public class Queue {
        int size;
        int[] queue;
        int top;
        int start;

        public Queue(int size) {
            this.size = size;
            top = -1;
            start = -1;
            queue = new int[size];
        }

        public boolean isEmpty() {
            return (top == start);
        }
        public boolean isFull() {
            return (queue.length-1 == top);
        }

        public void push(int item) {
            if(isFull()) {
                return;
            }
            queue[++top] = item;
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            this.size++;
            return queue[++start];
        }

        public int size() {
            return top-start;
        }

        public int empty() {
            return isEmpty() ? 1 : 0;
        }

        public int front() {
            if(isEmpty()) {
                return -1;
            }
            return queue[start+1];
        }

        public int back() {
            if(isEmpty()) {
                return -1;
            }
            return queue[top];
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int repeat_num = Integer.parseInt(input.readLine());
        Main br = new Main();
        Queue queue = br.new Queue(repeat_num);


        for(int i =0; i< repeat_num; i++) {
            String command = input.readLine();

            if(command.startsWith("push")) {
                int item = Integer.parseInt(command.split(" ")[1]);
                queue.push(item);
            } else if(command.equals("pop")) {
                System.out.println(queue.pop());
            } else if(command.equals("size")) {
                System.out.println(queue.size());
            } else if(command.equals("empty")) {
                System.out.println(queue.empty());
            } else if(command.equals("front")) {
                System.out.println(queue.front());
            } else if(command.equals("back")) {
                System.out.println(queue.back());
            }
        }
    }
}
