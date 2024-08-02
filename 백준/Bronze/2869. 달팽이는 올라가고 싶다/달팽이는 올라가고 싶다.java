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
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int v = Integer.parseInt(token.nextToken());
        int day = 0;
        // int cal = 0;
        // while(true) {
        //     day++;
        //     cal += a;
        //     if(cal >= v) {
        //         break;
        //     }
        //     cal -= b;
        // }
        if((v-a)%(a-b)==0) {
            day = (v-a)/(a-b)+1;
        } else if((v-a)%(a-b)!=0) {
            day = (v-a)/(a-b)+2;
        } else if(v == a) {
            day = 1;
        }

        output.write(String.valueOf(day));
        output.flush();
        output.close();
        input.close();
    }
}
