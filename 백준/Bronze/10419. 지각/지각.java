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

        for(int i =0; i < repeat_num; i++) {
            int num = Integer.parseInt(input.readLine());
            
            int total = 0;

            while(total+total*total <= num) {
                total++;
            }
            output.write(String.valueOf(total-1)+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}