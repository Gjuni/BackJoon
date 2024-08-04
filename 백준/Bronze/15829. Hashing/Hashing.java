import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat_num = Integer.parseInt(input.readLine());
        String token = input.readLine();
        long total = 0;
        long pow = 1;
        int M = 1234567891;

        for(int i =0; i< repeat_num; i++) {
            int charaterValue = token.charAt(i)-'a'+1;
            total = (total + charaterValue * pow)%M;
            pow = (pow*31)%M;
        }

        output.write(String.valueOf(total));
        
        output.flush();
        input.close();
        output.close();
    }
}
