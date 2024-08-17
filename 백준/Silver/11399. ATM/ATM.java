import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        StringTokenizer token = new StringTokenizer(input.readLine());
        int takes_time[] = new int[repeat_num+1];
        for(int i =1; i<= repeat_num; i++) {
            takes_time[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(takes_time);
        
        int total = 0;
        for(int i =1; i<= repeat_num; i++) {
            int start = 1;
            while(start <= i){
                total += takes_time[start];
                start++;
            }
        }

        output.write(String.valueOf(total));
        input.close();
        output.flush();
        output.close();
    }
}
