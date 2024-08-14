import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(input.readLine());

        double diagonal = Integer.parseInt(token.nextToken());
        double height = Integer.parseInt(token.nextToken());
        double weight = Integer.parseInt(token.nextToken());

        
        double temp = Math.sqrt((diagonal*diagonal)/(height*height+weight*weight));
        output.write(String.valueOf((int)(height*temp))+" "+String.valueOf((int)(weight*temp)));

        input.close();
        output.flush();
        output.close();
    }
}
