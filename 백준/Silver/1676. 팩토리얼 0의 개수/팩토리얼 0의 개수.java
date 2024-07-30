import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        int count_zero =0;

        int i = 5;
        while(i <= num) {
            count_zero += num/i;
            i *= 5;
        }
        output.write(String.valueOf(count_zero));
        output.flush();
        output.close();
        input.close();
    }
}
