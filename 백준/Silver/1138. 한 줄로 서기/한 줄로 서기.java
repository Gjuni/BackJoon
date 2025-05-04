/**
 *  문제 이름 : 한 줄로 서기기
 * 
 *  난 이  도 : 실버 2
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
import java.util.StringTokenizer;
 
 public class Main {
     static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
     public static void main(String[] args) throws IOException{
         int n = Integer.parseInt(input.readLine());

         int[] arr = new int[n];

         StringTokenizer token = new StringTokenizer(input.readLine());

         for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
         }

         int num = 1;
         
         int new_arr[] = new int[n];
         
         for (int i = 0; i < n; i++) {
             int index = arr[i];
             int next_index = 0;

            for(int j = 0; j < n; j++) {
                if((next_index == index) && new_arr[j] == 0) {
                    new_arr[j] = num;
                    break;
                } else if(!(next_index == index) && new_arr[j] == 0) {
                    next_index++;
                }
            }
            num++;
         }

         for(int i =0 ; i< n; i++) {
             output.write(String.valueOf(new_arr[i])+" ");
         }
 
         input.close();
         output.close();
     }
 }