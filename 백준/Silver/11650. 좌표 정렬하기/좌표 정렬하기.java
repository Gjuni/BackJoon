import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        //2차원 x좌표 기준으로 정렬
        // x좌표가 동일하다면 y좌표 기준으로 정렬

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        int[][] num_array = new int[repeat_num][2];

        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token1 = new StringTokenizer(input.readLine());
            num_array[i][0] = Integer.parseInt(token1.nextToken());
            num_array[i][1] = Integer.parseInt(token1.nextToken());
        }

        Arrays.sort(num_array, (a,b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        }) ;

        for(int i =0; i< repeat_num; i++) {
            output.write(String.valueOf(num_array[i][0]+" "+num_array[i][1]+"\n"));
        }
        output.flush();
        output.close();
        input.close();
    }
}
