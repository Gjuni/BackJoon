import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    static int n = 0;
    static int current_house_num;

    public static int solve(int[][] arr, int h, int w) {
        if((n > h && h >= 0) && (n > w && w >= 0)) {
            if(arr[h][w] == 1) {
                arr[h][w] = 0;
    
                solve(arr, h-1, w);
                solve(arr, h+1, w);
                solve(arr, h, w+1);
                solve(arr, h, w-1);
    
                current_house_num++;
            }
        }

        return current_house_num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(input.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            String string = input.readLine();

            for (int j = 0; j < string.length(); j++) {
                arr[i][j] = string.charAt(j)-'0';
            }

        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    current_house_num = 0;

                    current_house_num = solve(arr, i, j);

                    list.add(current_house_num);
                    
                    answer++;
                }
            }
        }

        output.write(String.valueOf(answer)+"\n");

        Collections.sort(list);

        for(int i : list) {
            output.write(String.valueOf(i)+"\n");
        }

        input.close();
        output.close();
    }
}
