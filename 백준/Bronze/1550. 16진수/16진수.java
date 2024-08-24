import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String hex = input.readLine();
        int result = 0;
        // A ~ F 까지 변환
        for(int i =0; i < hex.length(); i++) {
            char compare = hex.charAt(i);
            
            if(compare >= 'A') {
                result += Math.pow(16 ,hex.length()-i-1) * (compare+10-'A');
            } else {
                result += Math.pow(16 ,hex.length()-i-1) * (compare - '0');
            }
        }
        output.write(String.valueOf(result));
        input.close();
        output.flush();
        output.close();
    }
}
