import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        // T한장 P한자루가 한 묶음
        // T사이즈는 6종류 (array[6]);
        // T는 남아도 되지만 P는 정확하게 맞아떨어져야함

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num_N = Integer.parseInt(input.readLine());
        int[] num_size = new int[6];
        StringTokenizer token1 = new StringTokenizer(input.readLine());

        for(int i =0; i< 6; i++) {
            num_size[i] = Integer.parseInt(token1.nextToken());
        }

        StringTokenizer token2 = new StringTokenizer(input.readLine());
        int boudle_T = Integer.parseInt(token2.nextToken());
        int boudle_P = Integer.parseInt(token2.nextToken());

        int out_T = 0;
        int out_P_boudle = num_N/boudle_P;
        int out_P_rest = num_N%boudle_P;
        for(int i =0; i< 6; i++) {
            if(num_size[i]%boudle_T != 0) {
                out_T += num_size[i]/boudle_T+1;
            } else {
                out_T += num_size[i]/boudle_T;
            }
        }
        output.write(String.valueOf(out_T+"\n"));
        output.write(String.valueOf(out_P_boudle+" "));
        output.write(String.valueOf(out_P_rest));

        output.flush();
        output.close();
        input.close();
    }
}