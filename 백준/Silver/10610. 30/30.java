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
        
        String num1 = input.readLine();
        boolean check = false;
        int total = 0;
        Integer temp[] = new Integer[num1.length()];
        for(int i =0; i< num1.length(); i++) {
            temp[i] = num1.charAt(i)-'0';
            total += temp[i];

            if(temp[i] == 0) {
                check = true;
            }
        }
        
        if(total%3 == 0 && check) {

            Arrays.sort(temp, Collections.reverseOrder());
            for(int i =0; i< num1.length(); i++) {
                output.write(String.valueOf(temp[i]));
            }
        } else {
            output.write(String.valueOf(-1));
        }

        input.close();
        output.flush();
        output.close();
    }
}
