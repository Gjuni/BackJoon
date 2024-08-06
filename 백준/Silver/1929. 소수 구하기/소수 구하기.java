import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token =  new StringTokenizer(input.readLine());
        int first_prime = Integer.parseInt(token.nextToken());
        int second_prime = Integer.parseInt(token.nextToken());
        HashSet<Integer> non_prime = new HashSet<Integer>();

        for(int i = 2; i <= second_prime/2; i++) {
            for(int j = 2; i*j <= second_prime; j++) {
                non_prime.add(i*j);
            }
        }

        for(int f = first_prime; f <= second_prime; f++) {
            if(f == 1) {
                ;
            } else if(!non_prime.contains(f)) {
                output.write(String.valueOf(f)+"\n");
            }
        }
        output.flush();
        output.close();
        input.close();
    }
}