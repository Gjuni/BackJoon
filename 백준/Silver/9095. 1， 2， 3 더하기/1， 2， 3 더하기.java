import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat_num = Integer.parseInt(input.readLine());

        int[] array = new int[repeat_num];
        int max = 0;
        for(int i =0; i< repeat_num; i++) {
            array[i] = Integer.parseInt(input.readLine());
            if(max < array[i]) {
                max = array[i];
            }
        }
        int[] save_file = new int[max+1];
        save_file[0] = 1;
        save_file[1] = 2;
        save_file[2] = 4;

        for(int i =3; i <= max; i++) {
            save_file[i] = save_file[i-1] + save_file[i-2] + save_file[i-3];
        }
        
        for(int i =0; i< repeat_num; i++) {
            output.write(String.valueOf(save_file[array[i]-1])+"\n");
        }
         
        input.close();
        output.flush();
        output.close();
    }
}
