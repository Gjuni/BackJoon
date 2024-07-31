import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

class Main
{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int card_num = Integer.parseInt(input.readLine());
        Queue<Integer> card = new LinkedList<>();

        card.clear();
        for(int i =0; i< card_num; i++) {
            card.add(i+1);
        }
        int idx =0;

        while(card.size() > 1) {
            idx++;
            if(idx%2 != 0) {
                card.remove();
            } else if(idx%2 == 0) {
                card.add(card.remove());
            }
        }

        output.write(String.valueOf(card.peek()));

        output.flush();
        output.close();
        input.close();
    }
}
