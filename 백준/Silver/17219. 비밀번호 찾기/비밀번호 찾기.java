
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String argc[]) throws IOException{

        StringTokenizer token = new StringTokenizer(input.readLine());

        int repeat_num = Integer.parseInt(token.nextToken());
        int answer = Integer.parseInt(token.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < repeat_num; i++) {
            token = new StringTokenizer(input.readLine());

            String website = token.nextToken();
            String password = token.nextToken();

            map.put(website, password);
        }

        for (int i = 0; i < answer; i++) {
            String s = input.readLine();

            String a = map.get(s);
            output.write(a+"\n");
        }

        input.close();
        output.close();
    }
}
