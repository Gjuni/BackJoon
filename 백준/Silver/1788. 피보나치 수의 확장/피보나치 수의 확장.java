import java.io.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    static int positive_arr[] = new int[1000001];
    static final int MOD = 1000000000;

    static public void positiveFibo(int num) {
        // 절댓값을 사용해 양수로 계산
        int absNum = Math.abs(num);
        
        // 초기값 설정
        positive_arr[0] = 0;
        positive_arr[1] = 1;
        
        // 피보나치 수열 계산
        for(int i = 2; i <= absNum; i++) {
            positive_arr[i] = (positive_arr[i-1] + positive_arr[i-2]) % MOD;
        }
    }

    public static void main(String[] args) throws IOException{
        int num = Integer.parseInt(input.readLine());
        
        // 피보나치 수열 계산
        positiveFibo(num);
        
        // 부호 결정
        if (num > 0) {
            // 양수인 경우 항상 양수
            output.write("1\n" + positive_arr[num]);
        } else if (num == 0) {
            // 0인 경우 0
            output.write("0\n0");
        } else {
            // 음수인 경우 n이 짝수면 음수, 홀수면 양수
            int absNum = Math.abs(num);
            int sign = (absNum % 2 == 0) ? -1 : 1;
            output.write(sign + "\n" + positive_arr[absNum]);
        }

        input.close();
        output.close();
    }
}