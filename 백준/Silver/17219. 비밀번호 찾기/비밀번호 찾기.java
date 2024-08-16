import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());
        int num1 = Integer.parseInt(token.nextToken());
        int num2 = Integer.parseInt(token.nextToken());
        HashMap<String, String> website = new HashMap<String, String>();

        for(int i =0; i< num1; i++) {
            StringTokenizer token2 = new StringTokenizer(input.readLine());
            website.put(token2.nextToken(), token2.nextToken());
        }

        for(int i =0; i< num2; i++) {
            output.write(website.get(input.readLine())+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}
