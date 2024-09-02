import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            int total =0;

            while(token.hasMoreTokens()) {
                total += Integer.parseInt(token.nextToken());
            }
            output.write(String.valueOf(total)+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}
