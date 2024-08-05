import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int repeat_num = Integer.parseInt(input.readLine());
        int[][] unit_num =  new int[15][15];
        
        for(int f = 1; f <= 14; f++) {
            int u =1;
            for(    ; u <= 14; u++) {
                if(f-1 == 0) {
                    unit_num[f-1][u] = u;
                } else if(u-1 == 0) {
                    unit_num[f][u] = 1;
                }
                unit_num[f][u] = unit_num[f-1][u] + unit_num[f][u-1];
            }
        }

        for(int i =0; i< repeat_num; i++) {
            int floor = Integer.parseInt(input.readLine());
            int unit = Integer.parseInt(input.readLine());
            output.write(String.valueOf(unit_num[floor][unit])+"\n");
        }
        output.flush();
        input.close();
        output.close();
    }
}
