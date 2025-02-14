import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    static int[] array_zero = new int[41];
    static int[] array_one = new int[41];

    public static void fibo(int start) {
        array_zero[0] = 1;
        array_one[0] = 0;
        array_zero[1] = 0;   
        array_one[1] = 1;

        for(int i = 2; i <= start; i++) {
            if(start > 1 && array_one[start] > 0 && array_zero[start] > 0) {
                break;
            }
            array_one[i] = array_one[i-1] + array_one[i-2];
            array_zero[i] = array_zero[i-1] + array_zero[i-2];
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat_num = Integer.parseInt(input.readLine());


        for(int i =0; i< repeat_num; i++) {
            int fibo_start_num = Integer.parseInt(input.readLine());

            fibo(fibo_start_num);

            output.write(String.valueOf(array_zero[fibo_start_num])+" "+String.valueOf(array_one[fibo_start_num])+"\n");
        }

        input.close();
        output.close();
    }
}
