

import java.io.*;
import java.util.HashSet;

class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String argc[]) throws IOException {

        String s = input.readLine();

        HashSet<String> set = new HashSet<>();


        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                set.add(s.substring(i, j)); // endIndex는 index값에서 포함되지 않음
            }
        }
        
        output.write(String.valueOf(set.size()));

        input.close();
        output.close();
    }
}