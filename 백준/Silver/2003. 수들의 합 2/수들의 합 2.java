/**
 *  문제 이름 : 수들의 합 2
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : N개의 수로 된 수열 A[N]이 존재한다. 
 *              A[i]부터 A[j]까지 합이 M이 되는 경우의 수를 구하는 프로그램을 작성하라
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
    public static int solve(int[] arr, int wants_num) {
        int answer = 0;
        int start = 0;
        int end = 0;
        int temp = arr[0];

        while(end < arr.length) {
            if(temp < wants_num) {
                if(end+1 < arr.length)
                    temp += arr[++end];
                else
                    break;
            } else if(temp > wants_num) {
                temp -= arr[start++];
            } else {
                answer++;
                
                if(start+1 < arr.length) { 
                    start++;
                    end = start;
                } else {
                    break;
                }
                temp = arr[start];
            }
        }
        return answer;
    }

    public static void main(String argc[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(input.readLine());

        int arr_lenght = Integer.parseInt(token.nextToken());
        int wants_num = Integer.parseInt(token.nextToken());

        int arr[] = new int[arr_lenght];

        token = new StringTokenizer(input.readLine());

        for(int i =0; i< arr_lenght; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        output.write(String.valueOf(solve(arr, wants_num)));

        input.close();
        output.close();
    }
}
