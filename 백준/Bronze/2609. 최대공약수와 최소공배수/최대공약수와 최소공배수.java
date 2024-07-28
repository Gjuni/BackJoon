import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(input.readLine());

        int[] num = new int[2];
        num[0] = Integer.parseInt(token.nextToken());
        num[1] = Integer.parseInt(token.nextToken());
        int max_divisor = 0;
        int min_multiple = 0;
        int idx = 1;
        Arrays.sort(num);
        
        while(true) {
            if(idx > num[1]) {
                break;
            } else if((num[0]%idx == 0) && (num[1]%idx == 0)) {
                if(max_divisor < idx) {
                    max_divisor = idx;
                }
            }
            idx++;
        }
        min_multiple = max_divisor*(num[0]/max_divisor*num[1]/max_divisor);
        output.write(String.valueOf(max_divisor+"\n"+min_multiple));

        output.flush();
        output.close();
        input.close();
    }
}
