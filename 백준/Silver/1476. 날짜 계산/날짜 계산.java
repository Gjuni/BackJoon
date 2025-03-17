import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());

        int E = Integer.parseInt(token.nextToken()); // 1 - 15
        int S = Integer.parseInt(token.nextToken()); // 1 - 28
        int M = Integer.parseInt(token.nextToken()); // 1 - 19

        int index = 1;
        int temp_E = 1;
        int temp_S = 1;
        int temp_M = 1;

        while (!(E == temp_E && S == temp_S && M == temp_M)) { 
            index++;
            temp_E++;
            temp_M++;
            temp_S++;
            
            if(temp_E > 15) {
                temp_E = 1;
            }

            if(temp_S > 28) {
                temp_S = 1;
            }

            if(temp_M > 19) {
                temp_M = 1;
            }
        }

        output.write(String.valueOf(index));


        input.close();
        output.close();
    }
}
