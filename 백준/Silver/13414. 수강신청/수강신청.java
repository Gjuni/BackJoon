/**
 *  문제 이름 : 수강신청
 * 
 *  난 이  도 : 실버 3
 * 
 *  아이디어 : 다시 신청하면 재등록됨
 *            수강 신청된 인원 순서대로 출력하라
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
    public static void main(String argc[]) throws IOException{

        StringTokenizer token = new StringTokenizer(input.readLine());

        int ineednum = Integer.parseInt(token.nextToken());
        int repeat_num = Integer.parseInt(token.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < repeat_num; i++) {
            String s = input.readLine();

            if(map.containsKey(s)) {
                map.replace(s, i);
                continue;
            }

            map.put(s, i);
            list.add(s);
        }

        list.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                return map.get(a).compareTo(map.get(b));
            }
        });

        int index = 0;
        for(String i : list) {
            if(index < ineednum) {
                output.write(i+"\n");
            }
            index++;
        }

        input.close();
        output.close();
    }
}