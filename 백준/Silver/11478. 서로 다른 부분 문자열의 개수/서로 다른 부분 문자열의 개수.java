import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = input.readLine();

        HashSet<String> set = new HashSet<>();
        
        for(int i =0; i < string.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j< string.length(); j++) {
                sb.append(string.charAt(j)); // 문자열을 합침
                set.add(sb.toString());
            }
        }
        
        
        output.write(String.valueOf(set.size()));

        input.close();
        output.flush();
        output.close();
    }
}