import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        int[] array = new int[repeat_num];
        int[] count = new int[repeat_num];
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer token = new StringTokenizer(input.readLine());

        for(int i =0; i< repeat_num; i++) {
            array[i] = Integer.parseInt(token.nextToken());
            set.add(array[i]);
        }   
        List<Integer> tempSet = new ArrayList<>(set);
        Collections.sort(tempSet);

        int idx = 0;
        int num = 0;
        while(idx < tempSet.size()) {
            for(int i =0; i< repeat_num; i++) {
                if(tempSet.get(idx).equals(array[i])) {
                    count[i] = num++;
                }
            }
            idx++;
        }
        
        for(int i =0; i< repeat_num; i++) {
            output.write(String.valueOf(count[i])+" ");
        }
        input.close();
        output.flush();
        output.close();
    }
}
