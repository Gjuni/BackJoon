/**
 *  문제 이름 : 수열
 * 
 *  난 이  도 : 실버 3
 * 
 *  아이디어 : 연속적인 며칠 동안의 온도의 합이 가낭 큰 값을 알아보자
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int solve(int arr[], int sequence_day) {
        int temp = 0;
        
        // 초기 값 설정
        for(int i =0; i< sequence_day; i++) {
            temp += arr[i];
        }
        
        int max_temp = temp;
        int start = 0;
        int end = sequence_day-1;
        
        while(end < arr.length-1) {
            temp += arr[++end];
            temp -= arr[start++];
            
            if(temp > max_temp) {
                max_temp = temp;
            }
        }
        return max_temp;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());

        int total_days = Integer.parseInt(token.nextToken());
        int sequence_day = Integer.parseInt(token.nextToken());

        int arr[] = new int[total_days];

        token = new StringTokenizer(input.readLine());

        for(int i =0; i< total_days; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        output.write(String.valueOf(solve(arr, sequence_day)));

        input.close();
        output.close();
    }
}
