import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(input.readLine());
        int result = (int)Math.pow(2, num);
        output.write(String.valueOf(result));

        input.close();
        output.flush();
        output.close();
    }
}
