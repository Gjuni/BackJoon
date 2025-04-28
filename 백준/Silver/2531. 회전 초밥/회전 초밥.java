/**
 *  문제 이름 : 회전 초밥
 * 
 *  난 이  도 : 실버 1
 * 
 *  아이디어 : 
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */


import java.io.*;
import java.util.*;
 
 public class Main {
     static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int solve(int arr[], int[] check, int N, int k, int c) {
        int answer = 0; // 쿠폰 사용
        int real_answer = 0;

        for(int i = 0; i< k; i++) {
            int current_num = arr[i];

            check[current_num]++;

            if(check[current_num] == 1) {
                answer++;
            }
        }

        int start = 0;
        int end = k-1;
        boolean cupon = false;

        while(start < N) {
            if(cupon) {
                answer--;
            }
            cupon = false;


            int current_start = arr[start++];
            --check[current_start];

            if(check[current_start] == 0) {
                answer--;
            }

            end = (end+1)%N;
            int current_end = arr[end];
            ++check[current_end];

            if(check[current_end] == 1) {
                answer++;
            }

            if(!(check[c] > 0)) {
                cupon = true;
            }

            if(cupon) {
                answer++;
            }

            real_answer = Math.max(real_answer, answer);
        }
        

        return real_answer;
    }   

     public static void main(String[] args) throws IOException {
         StringTokenizer token = new StringTokenizer(input.readLine());

         int N = Integer.parseInt(token.nextToken()); // 배열의 크기
         int d = Integer.parseInt(token.nextToken()); // 초밥의 가지 수
         int k = Integer.parseInt(token.nextToken()); // 연속해서 먹는 접시의 수
         int c = Integer.parseInt(token.nextToken()); // 쿠폰 번호
 

        int arr[] = new int[N];
        int check[] = new int[d+1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        output.write(String.valueOf(solve(arr, check, N, k, c)));

        input.close();
        output.close();
     }
 }