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

        StringTokenizer token1 = new StringTokenizer(input.readLine());

        int com_width = Integer.parseInt(token1.nextToken());
        int com_height = Integer.parseInt(token1.nextToken());
        int stick_width = Integer.parseInt(token1.nextToken());
        int stick_height = Integer.parseInt(token1.nextToken());

        if((com_width-1 > stick_width) && (com_height-1 > stick_height)) {
            output.write(String.valueOf(1));
        } else {
            output.write(String.valueOf(0));
        }

        input.close();
        output.flush();
        output.close();
    }
}
