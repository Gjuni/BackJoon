/**
 *  문제 이름 : 에디터
 * 
 *  난 이  도 : 실버 2
 * 
 *  아이디어 : 
 *              L : 커서를 왼쪽으로 한칸 옮김 (커서가 문장의 맨 앞이면 무시)
 *              D : 커서를 오른쪽으로 한칸 옮김 (커서가 문장의 맨 뒤면 무시)
 *              B : 커서 왼쪽에 있는 문자를 삭제 (커서가 문장의 맨 앞이면 무시됨)
 *                  삭제로 인해 커서는 한칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로
 *              P $ : $라는 문자를 커서 왼쪽에 추가가
 * 
 *              명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치치
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
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void solve(ListIterator<Character> list, int repeat_num, BufferedReader input) throws IOException {
        while(list.hasNext()) {
            list.next();
        }

        for (int i = 0; i < repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());

            String commend = token.nextToken();

            switch (commend) {
                case "L":
                    if(list.hasPrevious()) {
                        list.previous();
                    }
                    break;
                case "D":   
                    if(list.hasNext()) {
                        list.next();
                    }
                    break;
                case "B":
                    if(list.hasPrevious()) {
                        list.previous();
                        list.remove();
                    }
                    break;
                case "P":
                    String add = token.nextToken();
                    char convert = add.charAt(0);

                    list.add(convert);
                    break;
            }
            
        }
    }
     public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String string = input.readLine();

        LinkedList<Character> list = new LinkedList<>();
        
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator(); // linked list자체가 header 주소를 가지고 있어야되기 떄문에

        int repeat_num = Integer.parseInt(input.readLine());

        solve(iterator, repeat_num, input);

        for(char temp : list) {
            output.write(temp);
        }

        input.close();
        output.close();
    }
}
