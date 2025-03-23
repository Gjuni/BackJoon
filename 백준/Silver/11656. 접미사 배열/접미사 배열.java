/**
 *  문제 이름 : 접미사 배열
 * 
 *  난 이  도 : 실버 4
 * 
 *  아이디어 : 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 * 
 *              baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 
 *              이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String argc[]) throws IOException{

        String s = input.readLine();

        char array[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            list.add(s.substring(i));
        }

        Collections.sort(list);

        for(String ne : list) {
            output.write(ne+"\n");
        }

        input.close();
        output.close();
    }
}
