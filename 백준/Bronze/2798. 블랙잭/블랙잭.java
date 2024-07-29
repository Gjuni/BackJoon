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
        // input
        StringTokenizer token_info = new StringTokenizer(input.readLine());
        int[] info = new int[2];
        info[0] = Integer.parseInt(token_info.nextToken()); // 0번은 카드를 받는 수
        info[1] = Integer.parseInt(token_info.nextToken()); // 1번은 총 맞는 숫자
        int[] cards_num = new int[info[0]];
        StringTokenizer token_cardsNum = new StringTokenizer(input.readLine());
        for(int i = 0; i< info[0]; i++) {
            cards_num[i] = Integer.parseInt(token_cardsNum.nextToken());
        }

        int result_card = 0;

        for(int first_card = 0; first_card < info[0]-2; first_card++) {
            for(int second_card = first_card+1; second_card < info[0]-1; second_card++) {
                for(int third_card = second_card+1; third_card < info[0]; third_card++) {
                    int compare_num = (cards_num[first_card]+cards_num[second_card]+cards_num[third_card]);
                    if(compare_num > result_card && compare_num <= info[1]) {
                        result_card = compare_num;
                        if(result_card == info[1]) {
                            break;
                        }
                    }
                }
            }
        }
        output.write(String.valueOf(result_card));
        
        output.flush();
        output.close();
        input.close();
    }
}