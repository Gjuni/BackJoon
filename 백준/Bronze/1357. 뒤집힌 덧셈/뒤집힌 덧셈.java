import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
    public int REV(int num) {
        int new_num = 0;
        while(num != 0) {
            new_num = new_num*10 + num%10;
            num = num/10;
        }
        return new_num;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(input.readLine());
        Main read = new Main();
        int result = read.REV(Integer.parseInt(token.nextToken())) + read.REV(Integer.parseInt(token.nextToken()));
        
        output.write(String.valueOf(read.REV(result)));
        input.close();
        output.flush();
        output.close();
    }
}