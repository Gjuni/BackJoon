import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = input.readLine();
        int tour[] = new int[3];
        for(int i =0; i< 3; i++) {
            String[] temp_array = string.split(" ");
            tour[i] = Integer.parseInt(temp_array[i]);
        }
        
        int count =0;

        while(tour[1] != tour[2]) {
            tour[1] = (tour[1]+1)/2;
            tour[2] = (tour[2]+1)/2;
            count++;
        }
        output.write(String.valueOf(count));
        input.close();
        output.flush();
        output.close();
    }
}
