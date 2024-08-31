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

        String string = "";
        
        while(true) {
            string = input.readLine();
            
            if(string.equals("*")) break;
            
            boolean check = true; // Hasmap에 중복이 있는 경우 False
            
            for(int i = 1; i< string.length(); i++) {
                HashSet<String> set = new HashSet<>();

                for(int idx = 0; idx+i < string.length(); idx++) {
                    String build = ""+string.charAt(idx)+string.charAt(idx+i);
                    
                    if(set.contains(build)) {
                        check = false;
                        break;
                    }
                    set.add(build);
                }
                if(!check) {
                    break;
                }
            }
            if(check) {
                output.write(string+" is surprising.\n");
            } else {
                output.write(string+" is NOT surprising.\n");
            }
        }

        input.close();
        output.flush();
        output.close();
    }
}
