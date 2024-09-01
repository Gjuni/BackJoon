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
        
        int repeat_num = Integer.parseInt(input.readLine());
        long array[] = new long[repeat_num];
        StringTokenizer token = new StringTokenizer(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            array[i] = Long.parseLong(token.nextToken());
        }
        int current_num = 0; // 배열 안의 값의 인덱스
        int result = 0;     // 좋은 수 갯수
        
        Arrays.sort(array);

        while(current_num < repeat_num) {
            int start = 0;
            int end = repeat_num-1;
            
            while(start < end) {
                long total = array[end] + array[start];

                if(array[current_num] == total) {
                    if(start == current_num) {
                        start++;
                    } else if(end == current_num) {
                        end--;
                    }else {
                        result++;
                        break;
                    }
                } else if(array[current_num] < total) {
                    end--;
                } else if(array[current_num] > total) {
                    start++;
                }
            }
            current_num++;
        }

        output.write(String.valueOf(result));
        input.close();
        output.flush();
        output.close();
    }
}
