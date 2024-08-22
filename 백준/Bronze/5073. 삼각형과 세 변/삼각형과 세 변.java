import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            int num[] = new int[3];

            for(int i =0; i< 3; i++) {
                num[i] = Integer.parseInt(token.nextToken());
            }

            if(num[0] == 0 && num[1] == 0 && num[2] == 0) {
                break;
            }

            Arrays.sort(num);
            if(num[2] >= num[1]+num[0]) {
                output.write("Invalid\n");
            } else {
                if(num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
                    output.write("Equilateral\n");
                } else if(num[0] != num[1] && num[1] != num[2] && num[0] != num[2]) {
                    output.write("Scalene\n");
                } else {
                    output.write("Isosceles\n");
                }
            }
        }
        output.flush();
        output.close();
        input.close();
    }
}
