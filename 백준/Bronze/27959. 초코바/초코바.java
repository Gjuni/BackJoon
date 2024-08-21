import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token1 = new StringTokenizer(input.readLine());
        int have_money = Integer.parseInt(token1.nextToken());
        int price = Integer.parseInt(token1.nextToken());

        if(have_money*100 >= price) {
            output.write("Yes");
        } else {
            output.write("No");
        }

        input.close();
        output.flush();
        output.close();
    }
}
