import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> mapping = new HashMap<>();
        
        int repeat_num = Integer.parseInt(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            String name = input.readLine();
            if(mapping.containsKey(name)) {
                mapping.put(name, mapping.get(name)+1);
            } else {
                mapping.put(name, 1);
            }
        }

        for(int i =0; i< repeat_num-1; i++) {
            String string = input.readLine();

            mapping.put(string, mapping.get(string)-1);
        }

        for(String key : mapping.keySet()) {
            if(mapping.get(key) > 0) {
                output.write(key+"\n");
            }
        }

        input.close();
        output.flush();
        output.close();
    }
}
