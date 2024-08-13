import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        long num = Long.valueOf(input.readLine());
        long total = 0;
        long i =0;
        int count = 0;

        while(true) {
            if(num == 1 || num == 2) {
                count++;
                break;
            } else if(total == num) {
                break;
            }
            
            if(total < num) {
                i++;
                total += i;
                count++;
            } else if(total > num) {
                count--;
                break;
            }
        }
        output.write(String.valueOf(count));

        input.close();
        output.flush();
        output.close();
    }
}
