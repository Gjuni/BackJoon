/**
 *  문제 이름 : 스택 수열
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 1 ~ n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
 *              스택에 PUSH하는 순서는 반드시 오름차순(1 2 3 4)으로 지키도록 한다.
 *              수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 PUSH와 POP 연산을 수행해야 하는지 알아낼 수 있다.
 *              이를 계산하는 프로그램을 작성하시오.
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
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(input.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] cmp_array = new int[num];

        for(int i = 0; i< num; i++) {
            int current = Integer.parseInt(input.readLine());

            cmp_array[i] = current;
        }

        ArrayList<String> list = new ArrayList<>();

        int index = 0;
        int stack_num = 0;
        boolean check = false;

        while(true) {   
            int temp = cmp_array[index];
            
            if(temp > stack_num) {
                stack.add(++stack_num);
                list.add("+");
            } else if(temp <= stack_num) {
                int temp_stack_num = stack.pop();

                if(temp == temp_stack_num) {
                    list.add("-");
                    index++;
                } else if(temp != temp_stack_num) {
                    check = true;
                    break;
                }
            }

            if(index == num) {
                break;
            }
        }

        if(check) {
            output.write("NO");
        } else {
            for(String string : list) {
                output.write(string+"\n");  
            }
        }
 
        input.close();
        output.close();
    }
}
