import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repaet_num = Integer.parseInt(input.readLine());
        HashSet<Integer> map = new HashSet<>();
        int[] ori_array = new int[repaet_num];

        StringTokenizer token = new StringTokenizer(input.readLine());

        for(int i =0; i< repaet_num; i++) { // O(n)
            ori_array[i] = Integer.parseInt(token.nextToken());
            map.add(ori_array[i]);
        }

        Object[] obj = map.stream().sorted().toArray();

        for(int i =0; i< repaet_num; i++) {
            output.write(String.valueOf(Arrays.binarySearch(obj, ori_array[i]))+" ");
        }

        input.close();
        output.flush();
        output.close();
    }
}
