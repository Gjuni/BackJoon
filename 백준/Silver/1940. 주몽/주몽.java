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

        int repeat_num = Integer.parseInt(input.readLine());
        int result_num = Integer.parseInt(input.readLine());
        int[] new_array = new int[repeat_num];
        StringTokenizer token = new StringTokenizer(input.readLine());
        for(int i =0; i< repeat_num; i++) {
           new_array[i] = Integer.parseInt(token.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = 1;

        while(start < repeat_num-1) {
            if(new_array[start]+new_array[end] == result_num) {
                count++;
            }

            if(end < repeat_num-1){
                end++;
            } else {
                start++;
                end = start+1;
            }
        }
        output.write(String.valueOf(count));
        input.close();
        output.flush();
        output.close();
    }
}
