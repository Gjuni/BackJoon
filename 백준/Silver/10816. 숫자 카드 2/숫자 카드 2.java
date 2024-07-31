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
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();

        int repeat_num = Integer.parseInt(input.readLine());
        StringTokenizer token1 = new StringTokenizer(input.readLine());
        for(int i =0; i< repeat_num; i++) {
            int now_token = Integer.parseInt(token1.nextToken());
            int count = h1.getOrDefault(now_token, 0); // 해당 값이 존재하면 0으로 초기 설졍시킴
            h1.put(now_token, count+1); 
        }

        int key_num = Integer.parseInt(input.readLine());
        StringTokenizer token2 = new StringTokenizer(input.readLine());

        for(int i=0; i< key_num; i++) {
            int get_key = Integer.parseInt(token2.nextToken());
            int count = h1.getOrDefault(get_key,0);
            h1.put(get_key, count);
            output.write(String.valueOf(h1.get(get_key))+" ");
        }

        output.flush();
        output.close();
        input.close();
    }
}
