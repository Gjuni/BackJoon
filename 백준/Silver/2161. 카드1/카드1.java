import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> throw_cards = new LinkedList<>();
        int number_cards = Integer.parseInt(input.readLine());

        for(int i =1; i<= number_cards; i++){
            throw_cards.add(i);
        }

        int idx = 1;
        while(!throw_cards.isEmpty()) {
            if(idx%2 == 0) {
                throw_cards.add(throw_cards.remove());
            } else if(idx%2 != 0) {
                output.write(String.valueOf(throw_cards.remove())+" ");
            }
            idx++;
        }

        input.close();
        output.flush();
        output.close();
    }
}
