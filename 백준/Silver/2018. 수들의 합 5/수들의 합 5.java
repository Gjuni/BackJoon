import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.valueOf(input.readLine());
        int count = 0; // 자기자신을 포함한다
        int start = 1, end =1;
        int sum = start;
        
        while(end <= num) {
            if(sum == num) {
                count++;
                end++;
                sum += end;
            } else if(sum < num) {
                end++;
                sum += end;
            } else if(sum > num) {
                sum -= start;
                start++;
            }
        }

        output.write(String.valueOf(count));

        input.close();
        output.flush();
        output.close();
    }
}
