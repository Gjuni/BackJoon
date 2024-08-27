import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        int idx = 1;

        while(repeat_num >= idx) {
            if(idx == 1) {
                output.write(String.valueOf(idx)+" ");
                idx++;
            }else {
                if(idx%6 == 1) {
                    output.write("Go! ");
                    output.write(String.valueOf(idx)+" ");
                } else {
                    output.write(String.valueOf(idx)+" ");
                }
                idx++;
            }
        }
        if(repeat_num%6 != 1) {
            output.write("Go!");
        }

        input.close();
        output.flush();
        output.close();
    }
}
