import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token1 = new StringTokenizer(input.readLine()); //  split사용하는게 파싱할때 좋다
        int total_len = Integer.parseInt(token1.nextToken());
        int needs_len = Integer.parseInt(token1.nextToken());
        int len_array[] = new int[needs_len];

        long max  =0;
        for(int i =0; i< total_len; i++) {
            len_array[i] = Integer.parseInt(input.readLine());
            if(max < len_array[i]) { // 최장 길이 탐색
                max = len_array[i];
            }
        }

        max++;
        long min =0;
        long mid = 0;
        long count =0;

        while(min < max) {
            mid = (min+max)/2;
            count = 0;

            for(int i =0; i< total_len; i++) {
                count += (len_array[i]/mid); // 중간 길이를 나눠줌
            }

            if(count < needs_len) {
                max = mid;
            } else {
                min = mid+1;
            }

        }
        output.write(String.valueOf(min-1));

        input.close();
        output.flush();
        output.close();
    }
}
