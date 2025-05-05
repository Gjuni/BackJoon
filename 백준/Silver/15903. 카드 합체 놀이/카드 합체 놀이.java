/**
 *  문제 이름 : 카드 합체 놀이
 * 
 *  난 이  도 : 실버 1
 * 
 *  아이디어 : 
 *              카드 N 장을 가지고 있다.
 *              1. x 번째 카드와 y 번째 카드를 골라 두 장에 쓰여진 수를 더한다.
 *              2. 계산한 값을 x와 y에 덮어씌운다.
 * 
 *              이 것을 m 번 한다. 
 *              가장 작은 점수를 만드는 경우는?
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

     public static long solve(PriorityQueue<Long> card, int m) {
        long answer = 0;

        for (int i = 0; i < m; i++) {
            long card_1 = card.poll();
            long card_2 = card.poll();

            long new_card = card_1+card_2;

            card.add(new_card);
            card.add(new_card);
        }

        for(long num : card) {
            answer += num;
        }

        return answer;
     }
     public static void main(String[] args) throws IOException{
         StringTokenizer token = new StringTokenizer(input.readLine());

         int n = Integer.parseInt(token.nextToken());
         int m = Integer.parseInt(token.nextToken());

         PriorityQueue<Long> card = new PriorityQueue<>();

         token = new StringTokenizer(input.readLine());

         for (int i = 0; i < n; i++) {
            card.add(Long.parseLong(token.nextToken()));
         }
 
         output.write(String.valueOf(solve(card, m)));

         input.close();
         output.close();
     }
 }