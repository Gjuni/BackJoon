import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public int max_times(int num1, int num2) {
        if(num1%num2 == 0) {
            return num2;
        }
        return max_times(num2, num1%num2);
    }
    public int min_division(int num1, int num2) {
        return (num1*num2)/max_times(num1, num2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Main write = new Main();
        int repeat_num = Integer.parseInt(input.readLine());
        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            int num1 = Integer.parseInt(token.nextToken());
            int num2 = Integer.parseInt(token.nextToken());

            output.write(write.min_division(num1, num2)+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}
