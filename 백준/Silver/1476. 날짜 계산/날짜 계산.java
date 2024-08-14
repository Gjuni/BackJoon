import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(input.readLine());

        int E = Integer.parseInt(token.nextToken());
        int S = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int time_E = 0;
        int time_S = 0;
        int time_M = 0;
        int result = 0;

        while((time_E != E)||(time_S != S)||(time_M != M)) {
            time_E++;
            time_M++;
            time_S++;

            if(time_E > 15) {
                time_E = 1;
            }

            if(time_M > 19) {
                time_M =1;
            }

            if(time_S > 28) {
                time_S = 1;
            }
            result++;
        }
        output.write(String.valueOf(result));
        
        input.close();
        output.flush();
        output.close();
    }
}
