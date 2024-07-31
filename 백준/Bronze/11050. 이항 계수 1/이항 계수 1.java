import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//55 silver = 7
class Main {

    public int recursive(int n) {
        if(n == 0) {
            return 1;
        }
        return n*recursive(n-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Main rc = new Main();
        StringTokenizer token = new StringTokenizer(input.readLine());
        int num1 = Integer.parseInt(token.nextToken());
        int num2 = Integer.parseInt(token.nextToken());

        // num1! / (num1-num2)!(num2)!
        long reault = rc.recursive(num1)/(rc.recursive((num1-num2))*rc.recursive(num2));
        output.write(String.valueOf(reault));
        output.flush();
        output.close();
        input.close();
    }
}