import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedHashMap<String, Integer> mapping = new LinkedHashMap<>();

        StringTokenizer token = new StringTokenizer(input.readLine());

        int out_num = Integer.parseInt(token.nextToken());
        int repeat_num = Integer.parseInt(token.nextToken());

        for (int i = 1; i <= repeat_num; i++) {
            String identity_string = input.readLine();
            if(mapping.containsKey(identity_string)) {
                mapping.remove(identity_string);
            }
            mapping.put(identity_string, i);
        }

        int idx = 0;
        for (String key : mapping.keySet()) {
            if (idx == out_num) {
                break;
            }
            output.write(key + "\n");
            idx++;
        }

        input.close();
        output.flush();
        output.close();
    }
}
