/**
 *  문제 이름 : 골드바흐 파티션
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 
 *              골드바흐의 추측 : 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
 *              
 *              짝수 N을 두 소수의 합으로 나타내는 표현을 골드하브 파티션이라고 한다.
 *              짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자.
 * 
 *              두 소수의 순서만 다른 것은 같은 파티션이다.
 * 
 *              tc = 100,
 *              N = 1,000,000
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */


import java.io.*;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] primary_arr = new boolean[1000001];

    public static void primary_count() {
        for(int i = 2; i < 1000000/2; i++) {
            for(int j = i*2; j < 1000000; j += i) {
                primary_arr[j] = true; 
            }
        }
    }

    public static int solve(int t) {
        int answer = 0;
        int start = 2;
        int end = 1000000;

        while (start <= end) { 
            while(primary_arr[start] == true || primary_arr[end] == true) {
                if(primary_arr[start] == true || primary_arr[end] == true) {
                    if(primary_arr[start] == true) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }

            if((start + end) == t) {
                answer++;
                start++;
            } else if((start+end) < t) {
                start++;
            } else if((start + end) > t) {
                end--;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        int tc = Integer.parseInt(input.readLine());

        primary_count();

        for (int i = 0; i < tc; i++) {
            int t = Integer.parseInt(input.readLine());

            output.write(String.valueOf(solve(t))+"\n");
        }

        input.close();
        output.close();
    }
}