import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = input.readLine();
        String copy_string = input.readLine();
        int idx = 0;
        int count = 0;

        // aabb ab   result = 1;
        for(int i =0; i< string.length()-copy_string.length()+1; i++) {
            idx = 0;

            while(idx < copy_string.length() && string.charAt(i+idx) == copy_string.charAt(idx)) {
                idx++;
            }

            if(idx == copy_string.length()) {
                count++;
                i += copy_string.length()-1;
            }
        }

        output.write(String.valueOf(count));

        input.close();
        output.flush();
        output.close();
    }
}
