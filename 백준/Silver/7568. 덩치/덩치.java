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

        int num = Integer.parseInt(input.readLine());
        int[][] info = new int[num][2];

        for(int i =0; i< num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());        
            info[i][0] = Integer.parseInt(token.nextToken());
            info[i][1] = Integer.parseInt(token.nextToken());
        }
        int[] rank_record = new int[num];
        
        for(int i =0; i< num; i++) {
            int rank =num;
            int count = 0;
            for(int j = 0; j < num; j++) {
                if((info[i][0] < info[j][0]) && (info[i][1] < info[j][1])) { // 몸무게 키 둘다 작다면
                    rank_record[i] = rank;
                } else if(((info[i][0] <= info[j][0]) && (info[i][1] >= info[j][1])) || ((info[i][0] >= info[j][0]) && (info[i][1] <= info[j][1]))) {
                    rank_record[i] = rank;
                    count++;
                } if((info[i][0] > info[j][0]) && (info[i][1] > info[j][1])) {
                    rank_record[i] = --rank;
                }
            }
            rank_record[i] -= count-1;
        }

        for(int i =0; i< num; i++) {
            output.write(String.valueOf(rank_record[i]));
            if(i < num-1) {
                output.write(" ");
            }
        }
        
        output.flush();
        input.close();
        output.close();
    }
}
