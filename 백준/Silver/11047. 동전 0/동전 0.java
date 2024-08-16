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

        StringTokenizer token = new StringTokenizer(input.readLine());
        int coin_kind = Integer.parseInt(token.nextToken());
        int total_money = Integer.parseInt(token.nextToken());
        int[] coin_array = new int[coin_kind];
        int count = 0;
        int compare_num = total_money;

        for(int i =0; i< coin_kind; i++) {
            coin_array[i] = Integer.parseInt(input.readLine());
        }

        int idx = coin_kind-1;
        while(compare_num != 0) {
            if(compare_num - coin_array[idx] < 0 && idx >= 0) {
                idx--;
            } else if(compare_num - coin_array[idx] > 0) {
                compare_num = compare_num - coin_array[idx];
                count++;
            } else if(compare_num - coin_array[idx] == 0) {
                compare_num -= coin_array[idx];
                count++;
                break;
            }
        }

        output.write(String.valueOf(count));
        input.close();
        output.flush();
        output.close();
    }
}
