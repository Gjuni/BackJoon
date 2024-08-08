import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = input.readLine();
        int count = 0; // 몇 번 변화가 거쳐졌는지 저장
        
        while(num.length() > 1) {
            long sum = 0;

            for(int i =0; i< num.length(); i++) {
                sum += num.charAt(i) -'0'; // 문자 합 구한 후
            }
            count++;

            num = String.valueOf(sum); // 다시 문자열로 저장 길이가 유지 될때까지 while문 돔
        }

        output.write(String.valueOf(count)+"\n"); 

        if(Integer.parseInt(num)%3 == 0) {
            output.write("YES");
        } else {
            output.write("NO");
        }

        output.flush();
        output.close();
        input.close();
    }
}
