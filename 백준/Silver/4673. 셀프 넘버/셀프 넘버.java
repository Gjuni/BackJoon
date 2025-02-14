
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    // selfnum 이 아니면 true
    static boolean check[] = new boolean[10003];

    public static void solve(int i) {
        int num = i;

        while(i >= 1) {
            num += i%10;
            i /= 10;
        }

        check[num] = true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        // 이전 수들로 만들어지지 않는 애들이 self number

        // 이전 수들로 만들어진다면 self number가 아니다.
        for(int i = 1; i <= 9973; i++) {
            solve(i);
        }

        for(int i = 1; i <= 10000; i++) {
            if(check[i] == false) {
                output.write(String.valueOf(i)+"\n");
            }
        }

        input.close();
        output.close();
    }
}
