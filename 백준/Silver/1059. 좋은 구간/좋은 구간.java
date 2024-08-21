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

        int num_count = Integer.parseInt(input.readLine());
        int num_array[] = new int[num_count];

        String string = input.readLine();
        for(int i =0; i< num_count; i++) {
            String[] strArr = string.split(" ");
            num_array[i] = Integer.parseInt(strArr[i]);
        }
        int round_num = Integer.parseInt(input.readLine());

        Arrays.sort(num_array);

        int min = num_array[0];
        int max = num_array[0];
        boolean check = true;
        
        for(int i =0; i< num_count; i++) {
            if(round_num < num_array[0]) {
                min = 1;
                max = num_array[0]-1;
            } else {
                if(num_array[i] < round_num) {
                    min = num_array[i]+1;
                } else if(num_array[i] > round_num) {
                    max = num_array[i]-1;
                    break;
                } else if(num_array[i] == round_num) {
                    check = false;
                    break;
                }
            }
        }
        
        int count = 0;
        if (check) {
            count = (round_num-min)*(max-round_num+1) + (max-round_num);
        } else {
            count = 0;
        }

        output.write(String.valueOf(count));

        input.close();
        output.flush();
        output.close();
    }
}
