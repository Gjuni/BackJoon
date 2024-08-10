import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        HashSet<String> didntListen = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i< n; i++) {
            didntListen.add(input.readLine());
        }
        for(int i =0; i< m; i++) {
            String name = input.readLine();
            if(didntListen.contains(name)) {
                list.add(name);
            }
        }
        Collections.sort(list);

        output.write(String.valueOf(list.size()));
        output.write("\n");
        for(String name : list) {
            output.write(name+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}
