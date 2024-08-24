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

        StringTokenizer token1 = new StringTokenizer(input.readLine());
        int broken_rope = Integer.parseInt(token1.nextToken());
        int repeat_num = Integer.parseInt(token1.nextToken());

        int boundle = Integer.MAX_VALUE;
        int each_rope = Integer.MAX_VALUE;

        for(int i =0; i < repeat_num; i++) {
            StringTokenizer token2 = new StringTokenizer(input.readLine());
            boundle = Math.min(boundle, Integer.parseInt(token2.nextToken())); // 번들 값 최솟값
            each_rope = Math.min(each_rope, Integer.parseInt(token2.nextToken())); // 각 개체 최솟값
        }

        int current_cost = each_rope * 6;
        int min_cost = 0;

        if(current_cost <= boundle) {
            min_cost = (broken_rope)*each_rope;    
        } else {
            min_cost = boundle*(broken_rope/6);

            if((broken_rope%6)*each_rope <= boundle) {
                min_cost += (broken_rope%6)*each_rope;
            } else {
                min_cost += boundle;
            }
        }
        
        output.write(String.valueOf(min_cost));
        input.close();
        output.flush();
        output.close();
    }
}