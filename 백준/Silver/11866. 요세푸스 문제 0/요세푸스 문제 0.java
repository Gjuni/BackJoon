/**
 *  문제 이름 : 
 * 
 *  난 이  도 : 
 * 
 *  아이디어 : 
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */


import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    static ArrayDeque<Integer> init_deque = new ArrayDeque<>();
    static Queue<Integer> new_Queue = new ArrayDeque<>();


    static public void solve(int count_num) {
        int index = 0;


        while(!init_deque.isEmpty()) {
            index++;
            
            int current_num = init_deque.poll();

            if(index < count_num) {
                init_deque.addLast(current_num);
            } 

            if(index == count_num) {
                new_Queue.add(current_num);
                index = 0;
            }

        }
    }


    public static void main(String[] args) throws IOException{
        StringTokenizer token = new StringTokenizer(input.readLine());

        int count_num = Integer.parseInt(token.nextToken());
        int add_count = Integer.parseInt(token.nextToken());

        for (int i = 1; i <= count_num; i++) {
            init_deque.add(i);
        }

        solve(add_count);

        StringBuilder build = new StringBuilder();

        build.append('<');

        for(int i = 0; i < count_num; i++) {
            build.append(new_Queue.poll());

            if(i < count_num-1) {
                build.append(',');
                build.append(' ');
            }
        }

        build.append('>');

        output.write(build.toString());

        input.close();
        output.close();
    }
}