import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        String words[] = new String[repeat_num];

        for(int i =0; i< repeat_num; i++) {
            words[i] = input.readLine();
        }
        LinkedHashSet<String> wordSet = new LinkedHashSet<>(Arrays.asList(words));
        words = wordSet.toArray(new String[0]);

        Arrays.sort(words, new Comparator<String>() { // 다양한 메소드를 활용할 수 있는 Comparator
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) { // 길이가 같다면
                    return o1.compareTo(o2);    // 같은 위치의 문자만 비교 (문자열끼리 비교)
                } else {
                    return Integer.compare(o1.length(), o2.length()); // 길이가 다르면 길이 순으로 정렬
                }
            }
        });

        //그대로 repeat_num을 사용하게 된다면 중복되는 문자 갯수 그대로 인덱스 오류가 일어남
        for(String str : words) {
            output.write(str+"\n");
        }

        input.close();
        output.flush();
        output.close();
    }
}
