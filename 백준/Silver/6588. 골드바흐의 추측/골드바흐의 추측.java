/**
 *  문제 이름 : 골드바흐의 추측
 * 
 *  난 이  도 : 실버 1
 * 
 *  아이디어 :   n이 주어졌을 때 n = a + b를 소수들로 나타낼 수 있다.
 *              소수의 합으로 나타낼 수 있는지 증명하라
 *              만약 여러 case가 존재한다면
 *              b-a가 가장 큰 수로 나타내라
 *              
 *              만약 나타낼 수 없다면
 *              Goldbach's conjecture is wrong. 을 출력
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

public class Main {
    static int array[] = new int[1000001];

    // 에라스토테네스의 체
    public static void find_decimal() {
        array[1] = 1;
        array[2] = 0;

        for(int i = 2; i<= Math.sqrt(1000000); i++) {
            for(int j = i*i; j <= 1000000; j+=i) {
                if(array[j] == 1) continue;

                array[j] = 1;
            }
        }
    }

    public static void solve(int num, BufferedWriter output) throws IOException{
        int a = 0;
        int b = 0;
        int check = 0;

        for(int i = 2; i <= num; i++) {
            a = i;
            b = num - i;
            
            if(array[a] == 0 && array[b] == 0) {
                output.write(String.valueOf(num)+" = "+String.valueOf(a)+" + "+String.valueOf(b)+"\n");
                return;
            }
        }
        
        output.write("Goldbach's conjecture is wrong.\n");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 100;

        find_decimal();

        while(true) {
            num = Integer.parseInt(input.readLine());

            if(num == 0) {
                break;
            }

            solve(num, output);
        }

        input.close();
        output.close();
    }
}
