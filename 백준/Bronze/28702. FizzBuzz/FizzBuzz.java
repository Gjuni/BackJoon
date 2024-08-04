import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info = new String[3];
        for(int i =0; i< 3; i++)  {
            info[i] = input.readLine();
        }
        int num1 =0;
        int idx =0;
        for(int i =1; i<= 3; i++) {
            if(info[i-1].equals("Fizz") || info[i-1].equals("Buzz") || info[i-1].equals("FizzBuzz")) {
                ;
            } else {
                num1 = Integer.parseInt(info[i-1]);
                idx = i;
            }
        }
        
        if(idx == 1) {
            idx = 3;
        } else if(idx == 2) {
            idx = 2;
        } else if(idx == 3) {
            idx = 1;
        }
        num1 += idx;
        if(num1%3 == 0 && num1%5 == 0) {
            output.write("FizzBuzz");
        } else if(num1%3 == 0) {
            output.write("Fizz");
        } else if(num1%5 == 0) {
            output.write("Buzz");
        } else {
            output.write(String.valueOf(num1));
        }

        output.flush();
        output.close();
        input.close();
    }
}
