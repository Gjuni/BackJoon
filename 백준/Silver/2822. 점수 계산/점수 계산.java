import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int num_array[] = new int[8];
        int compare_array[] = new int[8];
        for(int i =0; i< 8; i++) {
            num_array[i] = Integer.parseInt(input.readLine());
            compare_array[i] = num_array[i];
        }
        Arrays.sort(num_array);
        int total = 0;
        for(int i =0; i< 8; i++) {
            if(i>2) {
                total += num_array[i];
            }
        }
        output.write(String.valueOf(total)+"\n");

        for(int i =0; i< 8; i++) {
            for(int j =3; j < 8; j++) {
                if(compare_array[i] == num_array[j]) {
                    output.write(String.valueOf(i+1)+" ");
                }
            }
        }
        input.close();
        output.flush();
        output.close();
    }
}
