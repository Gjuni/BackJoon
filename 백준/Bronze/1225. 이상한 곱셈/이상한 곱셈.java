import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());
        String num1 = token.nextToken();
        String num2 = token.nextToken();
        BigInteger total = BigInteger.ZERO;

        for(int i =0; i < num1.length(); i++) {
            for(int j =0; j< num2.length(); j++) {
                BigInteger num3 = BigInteger.valueOf((num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
                total = total.add(num3);
            }
        }

        output.write(String.valueOf(total));

        input.close();
        output.flush();
        output.close();
    }
}