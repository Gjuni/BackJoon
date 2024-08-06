import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        // 300,000;
        int repeat_num = Integer.parseInt(input.readLine());
        int[] reputation = new int[repeat_num];

        for(int i =0; i< repeat_num; i++) {
            reputation[i] = Integer.parseInt(input.readLine());
        }
        Arrays.sort(reputation);
        int trimmed_mean = (int)Math.round(repeat_num*0.15);

        int total =0;
        int idx = 0;
        for(int i = trimmed_mean; i < repeat_num-trimmed_mean; i++) {
            total += reputation[i];
            idx ++;
        }

        total = (int)Math.round((double)total/idx);
        output.write(String.valueOf(total));
        output.flush();
        output.close();
        input.close();
    }
}