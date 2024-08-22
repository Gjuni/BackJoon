import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = input.readLine();
        char array[] = new char[string.length()*2-2];
        array[0] = 'h';
        array[array.length-1] = 'y';

        for(int i =1; i< array.length-1; i++) {
            array[i] = 'e';
        }
        for(int i =0; i< array.length; i++) {
            output.write(array[i]);
        }

        input.close();
        output.flush();
        output.close();
    }
}
