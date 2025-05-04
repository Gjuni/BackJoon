/**
 *  문제 이름 : 패션왕 신해빈
 * 
 *  난 이  도 : 실버 3
 * 
 *  아이디어 : 해빈이는 패션이 매우 민감해서 한번 입었던 옷의 조합을 다시 입지 않는다.
 *            해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를 추가로 입거나 안경 대신 렌즈를 착용하거나 해야한다.
 *            가진 의상들이 주어졌을 때 과연 해빈이는 알몸이 아닌 상태로 몇일 동안 돌아다닐 수 있을까?
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
     public static void main(String[] args) throws IOException{
         int tc = Integer.parseInt(input.readLine());

         for (int i = 0; i < tc; i++) {
            int repeat_num = Integer.parseInt(input.readLine());
            int answer = 1;

            HashMap<String, ArrayList<String>> map = new HashMap();

            for (int j = 0; j < repeat_num; j++) {
                StringTokenizer token = new StringTokenizer(input.readLine());

                String kindOfCloth = token.nextToken(); // hat, sunglasses 같이 큰 부류에서 파생되서 나온 세부 옷 정보
                String partOfCloth = token.nextToken(); // headgear, face 같이 큰 범위의 부분

                if(!(map.containsKey(partOfCloth))) {
                    map.put(partOfCloth, new ArrayList<>());
                }

                map.get(partOfCloth).add(kindOfCloth);
            }

            for(String key : map.keySet()) {
                int len = (map.get(key).size()+1);

                answer *= len;
            }

            output.write(String.valueOf(answer-1)+"\n");
         }
 
         input.close();
         output.close();
     }
 }