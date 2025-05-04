/**
 *  문제 이름 : 주유소
 * 
 *  난 이  도 : 실버 3
 * 
 *  아이디어 : N개의 도시가 있다. 
 *              가장 왼쪽 도시에서 오른쪽 도시로 이동하려고 한다.
 *              이때 차에 기름값을 가장 적게 산출할 수 있도록 주유소를 들르고 싶다.
 *              도시에서의 기름 가격은 다 다르다. 
 * 
 *  해    설 : 
 *              처음에 브루트포스로 풀까 했지만... 깊게 생각해보니 그럴 필요가 없었다.
 *              
 *              전반적인 식은 이렇게 짰다.
 *              total_dist : 모든 거리의 합
 *              min_value  : 현재의 가장 저렴한 가격
 *              temp_value : 다음 예상 가격
 * 
 *              temp_value = min_value - (city[i-1] * total_dist) + (city[i-1] * dist[i-1])
 *              total_dist -= dist[i-1]
 *              temp_value += city[i] * total_dist
 * 
 *              즉 다음 예상 가격에서 현재의 전체 가격을 빼준 뒤 남은 거리에 대한 기름 가격을 더해준다.
 *              그 후 전체 거리에서 이미 산 기름 거리를 뺀 후
 *              다음 도시에서 살 가격을 더한 후
 * 
 *              min_value와 temp_value의 작은 값을 구하게 되면 풀리는 문제이다.
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

     public static int solve(int[] city, int[] dist, int total_dist) {
        int min_value = city[0] * total_dist;
        int temp_min_value = city[0]*total_dist;

        for(int i = 1; i < dist.length; i++) {
            temp_min_value = min_value - (city[i-1]*total_dist) + (city[i-1]*dist[i-1]);

            total_dist -= dist[i-1];

            temp_min_value += (city[i] * total_dist);

            min_value = Math.min(temp_min_value, min_value);
        }

        return min_value;
     }
     
     public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(input.readLine());

        int dist[] = new int[N-1];
        int city[] = new int[N];
        int total_dist = 0;

        StringTokenizer token = new StringTokenizer(input.readLine());

        for (int i = 0; i < N-1; i++) {
            dist[i] = Integer.parseInt(token.nextToken());
            total_dist += dist[i];
        }

        token = new StringTokenizer(input.readLine());

        for (int i = 0; i < N; i++) {
            city[i] = Integer.parseInt(token.nextToken());
        }

        output.write(String.valueOf(solve(city, dist, total_dist)));
 
         input.close();
         output.close();
     }
 }