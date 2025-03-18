import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int arr[];
    static boolean visit[]; // 중복 방지

    public static int solve(int K, int N) {
        int index = 0;

        for (int i = 2; i <= K; i++) {
            for (int j = i; j <= K; j+=i) {
                if(visit[j] == false) {
                    visit[j] = true;
                    arr[index++] = j;
                }

                if(index == N) {
                    break;
                }   
            }

            if(index == N) {
                break;
            }       
        }
        return arr[index-1];
    }

    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());

        int K = Integer.parseInt(token.nextToken());
        int N = Integer.parseInt(token.nextToken());

        arr = new int[K+1];
        visit = new boolean[K+1];

        output.write(String.valueOf(solve(K, N)));

        input.close();
        output.close();
    }
}
