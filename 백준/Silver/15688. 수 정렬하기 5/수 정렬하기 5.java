import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());

        int arr[] = new int[repeat_num];

        for (int i = 0; i < repeat_num; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < repeat_num; i++) {
            output.write(String.valueOf(arr[i])+"\n");
        }

        input.close();
        output.close();
    }
}
