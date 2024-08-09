import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int stick_lenght = Integer.parseInt(input.readLine());
        // 2진수로 변환 후 
        // 1의 갯수를 세면 끝
        int count_one = 0;
        String bitString = Integer.toBinaryString(stick_lenght);

        for(int i =0; i< bitString.length(); i++) {
            if(bitString.charAt(i) == '1') {
                count_one++;
            }
        }
        output.write(String.valueOf(count_one));
        input.close();
        output.flush();
        output.close();
    }
}
