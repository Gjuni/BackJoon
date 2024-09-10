import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static int S[];
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void add(int idx) {
        S[idx] = idx;
    }

    public static void remove(int idx) {
        S[idx] = -1;
    }

    public static void check(int idx) throws IOException {
        if (S[idx] != -1) {
            output.write(String.valueOf(1)+"\n");
        } else {
            output.write(String.valueOf(0)+"\n");
        }
    }

    public static void toggle(int idx) {
        if (S[idx] != -1)
            S[idx] = -1;
        else
            S[idx] = idx;
    }

    public static void all() {
        for (int i = 1; i <= 20; i++) {
            S[i] = i;
        }
    }

    public static void empty() {
        for (int i = 1; i <= 20; i++) {
            S[i] = -1;
        }
    }

    public static void main(String[] args) throws IOException {
        int repeat_num = Integer.parseInt(input.readLine());
        S = new int[21];
        for (int i = 0; i < 21; i++) {
            S[i] = -1;
        }

        for (int i = 0; i < repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            String string = token.nextToken();
            int num = 0;

            if (token.hasMoreTokens()) {
                num = Integer.parseInt(token.nextToken());
            }

            switch (string) {
                case "add":
                    add(num);
                    break;
                case "remove":
                    remove(num);
                    break;
                case "check":
                    check(num);
                    break;
                case "toggle":
                    toggle(num);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }

        input.close();
        output.flush();
        output.close();
    }
}
