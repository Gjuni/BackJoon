import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = input.readLine();
        Integer[] array = new Integer[num.length()];

        for(int i = 0; i< num.length(); i++) {
            array[i] = num.charAt(i)-'0';
        }
        Arrays.sort(array, Collections.reverseOrder());

        for(int i = 0; i < num.length(); i++) {
            output.write(String.valueOf(array[i]));
        }

        input.close();
        output.flush();
        output.close();
    }
}
