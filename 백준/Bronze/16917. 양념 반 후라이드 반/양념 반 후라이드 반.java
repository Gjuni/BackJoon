import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(input.readLine());

        int spicy_chicken = Integer.parseInt(token.nextToken());  
        int fried_chicken = Integer.parseInt(token.nextToken());  
        int half_chicken = Integer.parseInt(token.nextToken());   
        int count_spicy = Integer.parseInt(token.nextToken());    
        int count_fried = Integer.parseInt(token.nextToken());    

        int cost = Integer.MAX_VALUE;


        for (int i = 0; i <= Math.max(count_spicy, count_fried); i++) {
            int spicy_left = Math.max(0, count_spicy - i);  
            int fried_left = Math.max(0, count_fried - i);  
            int current_cost = i * 2 * half_chicken + spicy_left * spicy_chicken + fried_left * fried_chicken;
            cost = Math.min(cost, current_cost);
        }

        output.write(String.valueOf(cost));

        input.close();
        output.flush();
        output.close();
    }
}