import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    long padoban[] = new long[101];
    public long padoban_func(int num) {

        if(num < 3) {
            return 1;
        } else {
            if(padoban[num] != 0) {
                return padoban[num];
            } else {
                padoban[num] = padoban_func(num-2) + padoban_func(num-3);
                return padoban[num];
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Main read = new Main();
        int repeat_num = Integer.parseInt(input.readLine());
        
        for(int i =0; i < repeat_num; i++) {
            int num = Integer.parseInt(input.readLine());
            output.write(String.valueOf(read.padoban_func(num-1))+"\n");
        }
        
        input.close();
        output.flush();
        output.close();
    }
}
