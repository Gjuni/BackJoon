import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int apple= 0;
        int banana = 0;
        int idx = 3;
        
        for(int i =0; i< 3; i++) {
            int num = Integer.parseInt(input.readLine());
            apple += num * idx;
            idx--;
        }
        idx = 3;
        for(int i =0; i< 3; i++) {
            int num = Integer.parseInt(input.readLine());
            banana += num * idx;
            idx--;
        }

        if(apple == banana) {
            output.write('T');
        } else if(banana < apple){
            output.write('A');
        } else if(banana > apple){
            output.write('B');
        }

        input.close();
        output.flush();
        output.close();
    }
}
