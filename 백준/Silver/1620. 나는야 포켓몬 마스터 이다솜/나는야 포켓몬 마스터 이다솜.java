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

        StringTokenizer num = new StringTokenizer(input.readLine());
        HashMap<String, String> pictorial = new HashMap<>();
        HashMap<String, String> pictorial_num = new HashMap<>();
        int number_of_pokimon = Integer.parseInt(num.nextToken());
        int find_pokimon = Integer.parseInt(num.nextToken());

        for(int i =1; i<= number_of_pokimon; i++) {
            String name_pokimon = input.readLine();
            String num2 = Integer.toString(i);
            pictorial.put(name_pokimon, num2);
            pictorial_num.put(num2, name_pokimon);
        }

        for(int i =1; i<= find_pokimon; i++) {
            String find = input.readLine();

            if(pictorial.containsKey(find)) {
                output.write(pictorial.get(find)+"\n");
            } else if(pictorial_num.containsKey(find)){
                output.write(pictorial_num.get(find)+"\n");
            }
        }
        input.close();
        output.flush();
        output.close();
    }
}
