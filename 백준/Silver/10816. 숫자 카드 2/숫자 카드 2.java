/**
 *  문제 이름 : 
 * 
 *  난 이  도 : 
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
import java.util.HashMap;
import java.util.StringTokenizer;

 public class Main {
     static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

     public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(input.readLine());
        
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer token = new StringTokenizer(input.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(token.nextToken());

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int M = Integer.parseInt(input.readLine());

        int[] count_arr = new int[M];

        token = new StringTokenizer(input.readLine());

        for (int i = 0; i < M; i++) {
            count_arr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int value = map.getOrDefault(count_arr[i], 0);
           
            output.write(String.valueOf(value));

            if(i < M-1) {
                output.write(' ');
            }
        }

    
         input.close();
         output.close();
     }
 }