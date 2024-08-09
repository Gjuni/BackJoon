import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        Integer[][] num_array = new Integer[2][repeat_num];
        StringTokenizer token1 = new StringTokenizer(input.readLine());
        StringTokenizer token2 = new StringTokenizer(input.readLine());

        for(int i =0;i < repeat_num; i++) {
            num_array[0][i] = Integer.parseInt(token1.nextToken());
            num_array[1][i] = Integer.parseInt(token2.nextToken());
        }

        // Arrays.sort는 행 단위로 정렬함;;
        Arrays.sort(num_array[0]);
        Arrays.sort(num_array[1], Collections.reverseOrder());
        
        int total = 0;
        
        for(int i =0; i< repeat_num; i++) {
            total += num_array[0][i] * num_array[1][i];
        }

        output.write(String.valueOf(total));
        input.close();
        output.flush();
        output.close();
    }
}
