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
        // 1,000,000,000  => 각 자리수 더한 합 + 그 원본 수

        for(int i =0; i < num; i++) {
            int c = i;
            int total =0;
            
            while(c != 0) { // 자릿수들의 덧셈들
                total += c%10;
                c = c/10;
            }
            c = i;
            if((c+total) == num) {
                output.write(String.valueOf(c));
                break;
            } else if(i == num-1 && (c+total) != num) {
                output.write(String.valueOf(0)); // for문에서 1일 경우 때문에 틀림
                                                    // 예외처리를 해주어야함
            }
        }

        output.flush();
        output.close();
        input.close();
    }
}
