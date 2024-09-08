import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Main {

    public static String convert(BigInteger total) {
        return total.toString(2); 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String binaryString = input.readLine();
        
        BigInteger total = new BigInteger(binaryString, 2);
        total = total.multiply(BigInteger.valueOf(17));
        output.write(convert(total));

        input.close();
        output.flush();
        output.close();
    }
}
