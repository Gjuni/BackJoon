import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = input.readLine();
        int[] num_array = new int[10];
        int max = 0;

        for(int i =0; i< num.length(); i++) {
            int digit = num.charAt(i)-'0';
            num_array[digit]++;
        }
        num_array[6] = (num_array[6]+num_array[9]+1)/2;
        num_array[9] = 0;

        for(int i =0; i< 10; i++) {
            if(max < num_array[i]) {
                max = num_array[i];
            }
        }

        output.write(String.valueOf(max));
        input.close();
        output.flush();
        output.close();
    }
}
