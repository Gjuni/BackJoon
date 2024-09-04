import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());
        int southernmostX = 1001; // since |x_i| <= 1000, start with a value outside this range
        int southernmostY = 1001; // since |y_i| <= 1000, start with a value outside this range

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (y < southernmostY) {
                southernmostY = y;
                southernmostX = x;
            } else if (y == southernmostY && x < southernmostX) {
                southernmostX = x;
            }
        }

        System.out.println(southernmostX + " " + southernmostY);
    }
}