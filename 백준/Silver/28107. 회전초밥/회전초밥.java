/**
 *  문제 이름 : 회전초밥
 * 
 *  난 이  도 : 실버 1
 * 
 *  아이디어 : 회전 초밥 가게에는 N명의 손님이 있고, M 개의 초밥을 순서대로 만든다.
 *              요리사가 초밥을 만들 경우, 1번 손님부터 N번 손님의 순서대로 그 초밥을 받게 된다.
 *              
 *              먼저 초밥을 받는 손님이 초밥을 먹을 경우, 뒤의 손님들은 해당 초밥을 먹을 수 없다. 만약 아무도 초밥을 먹지 않는다면, 초밥은 버려진다.
 * 
 *              N 명의 손님은 각자 먹고 싶은 초밥이 적힌 주문 목록을 가지고 있다.
 *              
 *              목록에 적힌 초밥의 순서에 상관 없이 만약 목록에 적혀있는 초밥이 앞에 오면 반드시 먹는다. 
 *              -> 목록에 적혀있지 않는 초밥을 받는다면 그 초밥은 먹지 않는다.
 * 
 *              손님들은 다양한 초밥을 먹고 싶어하기 때문에 각 종류의 초밥은 최대 한 번만 먹는다.
 *              
 *              각 손님의 주문 목록과 순서대로 만들어지는 M개의 초밥이 주어질 때, 각 손님이 먹게 되는 초밥의 갯수.
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

class Customer implements Comparable<Customer> {
    int sushi;
    int cusNum;

    Customer(int sushi, int cusNum) {
        this.sushi = sushi;
        this.cusNum = cusNum;
    }

    @Override
    public int compareTo(Customer customer) {
        if (this.sushi == customer.sushi) {
            return this.cusNum - customer.cusNum;
        }

        return this.sushi - customer.sushi;
    }
}
 
 public class Main {
     static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
     public static void main(String[] args) throws IOException{
        StringTokenizer token = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        PriorityQueue<Customer> person_q = new PriorityQueue<>();
        PriorityQueue<Integer> sushi_q = new PriorityQueue<>();

        
        for (int i = 1; i <= N; i++) {
            token = new StringTokenizer(input.readLine());
            
            int person_repeat_num = Integer.parseInt(token.nextToken());

            for (int j = 0; j < person_repeat_num; j++) {

                int sushi_value = Integer.parseInt(token.nextToken());

                person_q.add(new Customer(sushi_value, i));
            }
        }

        token = new StringTokenizer(input.readLine());

        for (int i = 0; i < M; i++) {
            sushi_q.add(Integer.parseInt(token.nextToken()));
        }

        int[] arr = new int[N+1];

        while(!sushi_q.isEmpty() && !person_q.isEmpty()) {
            Customer q = person_q.peek();
            int sushi = sushi_q.peek();

            int cusNum = q.cusNum;
            int sushiNum = q.sushi;


            if(sushi == sushiNum) {
                arr[cusNum]++;
                sushi_q.poll();
                person_q.poll();
            } else if(sushi < sushiNum) {
                sushi_q.poll();
            } else if(sushi > sushiNum) {
                person_q.poll();
            }
        }

        for(int i =1; i<=N; i++) {
            output.write(String.valueOf(arr[i])+" ");
        }

        input.close();
        output.close();
     }
 }