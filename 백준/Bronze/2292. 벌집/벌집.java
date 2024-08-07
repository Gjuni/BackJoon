import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        long room_num = Integer.parseInt(input.readLine());
        long count_room = 1;
        int answer = 0;

        // 외곽이 올라갈 때마다 외곽*6;
        // 즉 수가 1외곽은 1, 2외곽은 1*6, 3외곽은 2*6
        // 숫자는 2외곽 (1*6)+1이 max, 3외곽은 2외곽 max_num + (2*6)
        if(room_num == 1) {
            answer = 1;
        } else {
            for(int i =0; i <= (room_num/6)+1; i++) {
                count_room = count_room + 6*i;
                
                if(count_room >= room_num) {
                    answer = i+1;
                    break;
                }
            }
        }
        output.write(String.valueOf(answer));

        input.close();
        output.flush();
        output.close();
    }
}
