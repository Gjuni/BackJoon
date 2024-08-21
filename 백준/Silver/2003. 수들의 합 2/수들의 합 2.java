import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력한 수가 넘어가면 start --, 아니라면 end++;
        // 입력한 수와 같다면 count++ 후 end++;

        StringTokenizer token1 = new StringTokenizer(input.readLine());
        int repeat_num = Integer.parseInt(token1.nextToken());
        int wants_num = Integer.parseInt(token1.nextToken());
        int num_array[] = new int[repeat_num]; 
        token1 = new StringTokenizer(input.readLine());
        for(int i =0; i< repeat_num; i++) {
            num_array[i] = Integer.parseInt(token1.nextToken());
        }
        int start = 0;
        int end = 1;
        int total = num_array[start];
        int count =0;
        
        while(end <= repeat_num) {
            if(total >= wants_num) {
                if(total == wants_num) {
                    count++;
                }
                total -= num_array[start++];
            } else {
                if(end < repeat_num) {
                    total += num_array[end];
                }
                end++;
            }
        }

        output.write(String.valueOf(count));

        input.close();
        output.flush();
        output.close();
    }
}
