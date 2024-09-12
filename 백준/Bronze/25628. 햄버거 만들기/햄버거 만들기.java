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

        StringTokenizer token = new StringTokenizer(input.readLine());

        int patty = Integer.parseInt(token.nextToken());
        int meat = Integer.parseInt(token.nextToken());
        int result = 0;

        if(patty/2 == 0 || meat == 0) {
            result = 0;
        } else if(patty/2 < meat/1) {
            result = patty/2;
        } else {
            result = meat/1;
        }
        output.write(String.valueOf(result));

        input.close();
        output.flush();
        output.close();
    }
}
