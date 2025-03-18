import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int GCD (int a, int b) {
        int temp = 0;

        while(b > 0) {
            temp = a%b;
            a = b;
            b = temp;
        }

        return a;
    }
    public static StringBuilder solve(int a, int b) {
        StringBuilder string = new StringBuilder();

        int divide = GCD(a, b);

        int result1 = a/divide;
        int result2 = b/divide;
        string.append(result2);
        string.append("/");
        string.append(result1);

        
        return string;
    }
    public static void main(String argc[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int total_num = Integer.parseInt(input.readLine());

        StringTokenizer token = new StringTokenizer(input.readLine());
        int big_wheel = Integer.parseInt(token.nextToken());

        // 최대 공약수를 통해서 나눠 주면 됨
        for(int i = 0; i < total_num-1; i++) {
            int small_wheel = Integer.parseInt(token.nextToken());

            output.write(String.valueOf(solve(small_wheel, big_wheel))+"\n");
        }

        input.close();
        output.close();
    }
}
