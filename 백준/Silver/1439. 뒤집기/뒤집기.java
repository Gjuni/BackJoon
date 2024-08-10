import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String bi_string = input.readLine();
        int[] array = new int[bi_string.length()];

        for(int i =0; i< bi_string.length(); i++) {
            if(i == bi_string.length()-1 && bi_string.charAt(i) != array[i-1]) {
                array[i] = bi_string.charAt(i) - '0';
            } else if(i < bi_string.length()-1 && bi_string.charAt(i) != bi_string.charAt(i+1)) {
                array[i] = bi_string.charAt(i)- '0';
            } else {
                array[i] = -1;
            }
        }
        
        int count_one =0;
        int count_zero = 0;
        
        for(int i =0; i< bi_string.length(); i++) {
            if(array[i] == 0) {
                count_zero ++;
            } else if(array[i] == 1){
                count_one++;
            }
        }

        if(count_one >= count_zero) {
            output.write(String.valueOf(count_zero));
        } else {
            output.write(String.valueOf(count_one));
        }

        input.close();
        output.flush();
        output.close();
    }
}
