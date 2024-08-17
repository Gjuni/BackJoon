import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token1 = new StringTokenizer(input.readLine());
        int count_num = Integer.parseInt(token1.nextToken());
        int repeat_num = Integer.parseInt(token1.nextToken());

        long count_array[] = new long[count_num+1];

        StringTokenizer num = new StringTokenizer(input.readLine());
        // 배열 누적 합 형태로 입력
        for(int i =1; i<= count_num; i++) {
            count_array[i] = count_array[i-1]+ Long.parseLong(num.nextToken());
        }

        for(int i  =0; i< repeat_num; i++) {
            StringTokenizer token2 = new StringTokenizer(input.readLine());
            long total =0;
            int start = Integer.parseInt(token2.nextToken());
            int end = Integer.parseInt(token2.nextToken());

            total = count_array[end] - count_array[start-1]; // (2,4) = (1,4)-(1,1); // (3,5) = (1,5)-(1,2);
            output.write(String.valueOf(total)+"\n");
        }
        input.close();
        output.flush();
        output.close();
    }
}
