import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger num1 = new BigInteger(input.readLine());
        BigInteger num2 = new BigInteger(input.readLine());

        output.write(num1.add(num2).toString() + "\n");
        output.write(num1.subtract(num2).toString() + "\n");
        output.write(num1.multiply(num2).toString() + "\n");

        input.close();
        output.flush();
        output.close();
    }
}