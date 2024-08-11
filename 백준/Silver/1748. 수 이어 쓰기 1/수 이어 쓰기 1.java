import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Integer.parseInt(input.readLine());

        // 1~ 9 1자리
        // 10~ 99 2자리
        // 100 ~ 999 3자리
        // 1000 ~ 9999 4자리

        int lenght = 0;

        for(int i =1; i <= num; i++) {
            if(i <= 9) {
                lenght++;
            } else if(i >= 10 && 100 > i) {
                lenght += 2;
            } else if(i >= 100 && i < 1000) {
                lenght += 3;
            } else if(i >= 1000 && i < 10000) {
                lenght += 4;
            } else if(i >= 10000 && i < 100000) {
                lenght += 5;
            } else if(i >= 100000 && i < 1000000) {
                lenght += 6;
            } else if(i >= 1000000 && i < 10000000) {
                lenght += 7;
            } else if(i >= 10000000 && i < 100000000) {
                lenght += 8;
            } else if(i >= 100000000 && i < 1000000000) {
                lenght += 9;
            }
        }

        output.write(String.valueOf(lenght));
        input.close();
        output.flush();
        output.close();
    }
}
