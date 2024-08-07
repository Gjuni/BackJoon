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

        // 1 = 666, 2 = 1666 ... 187 = 66666 ... 500 = 166699
        int count = 0;
        int movie_num = 666;
        while(true) {
            int delta_num = movie_num; // 나눌 수
            int duplication = 3; // 6이 연속 3개

            while(delta_num != 0) { // 자리수 나눔
                if(delta_num%10 == 6) {
                    duplication--;
                    if(duplication == 0) {
                        count++;
                        break;
                    }
                } else {
                    duplication = 3;
                }
                delta_num /= 10;
            }
            if(count == num) {
                break;
            }
            movie_num++;
        }

        output.write(String.valueOf(movie_num));

        input.close();
        output.flush();
        output.close();
    }
}
