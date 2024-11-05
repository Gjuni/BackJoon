import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static int binsearch(int len_cookie[], int max, int person) {
        int cnt;
        int low = 1;
        int high = max; 
        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2; 
            cnt = 0;

            
            for (int i = 0; i < len_cookie.length; i++) {
                cnt += len_cookie[i] / mid;
            }

            if (cnt >= person) { // mid값이 커져야함
                answer = mid; 
                low = mid + 1;
            } else {             // mid값이 작아져야함
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());

        int person = Integer.parseInt(token.nextToken());
        int cookie = Integer.parseInt(token.nextToken());

        int len_cookie[] = new int[cookie];
        StringTokenizer token2 = new StringTokenizer(input.readLine());

        for (int i = 0; i < cookie; i++) {
            len_cookie[i] = Integer.parseInt(token2.nextToken());
        }
        
        Arrays.sort(len_cookie);
        
        
        output.write(String.valueOf(binsearch(len_cookie, len_cookie[cookie - 1], person)));
        
        input.close();
        output.close();
    }
}
