import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter ouput = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        int num_array[] = new int[repeat_num];

        for(int i =0; i< repeat_num; i++) {
            num_array[i] = Integer.parseInt(input.readLine());
        }
        Arrays.sort(num_array);

        for(int i : num_array) {
            ouput.write(i + "\n");
        }        
        ouput.flush();
        ouput.close();
    }
}