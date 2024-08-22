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

        int height = Integer.parseInt(token.nextToken());
        int times = Integer.parseInt(token.nextToken());

        while(times > 0) {
            if(height%2 == 0) {
                height = (height/2)^6;
            } else {
                height = (height*2)^6;
            }
            times--;
        }
        output.write(String.valueOf(height));
        input.close();
        output.flush();
        output.close();
    }
}
