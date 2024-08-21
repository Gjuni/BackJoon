import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int room_num = Integer.parseInt(input.readLine());

        int max = 1;
        int min = 0;
        int idx = 0;

        if(room_num == 1) {
            output.write(String.valueOf(1));
        } else if(room_num > 1) {
            while(true) {
                idx++;
                min = max+1; // 이전 방 + 1
                max = max + 6*idx; // 그 다음 방 + 가장 큰 방 값
                if(room_num >= min && room_num <= max) {
                    break;
                }
            }
            output.write(String.valueOf(idx+1));
        }
        input.close();
        output.flush();
        output.close();
    }
}