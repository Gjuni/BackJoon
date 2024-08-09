import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public int mean(int[] num_array, int repeat_num) { // 산술평균
        int result = 0;
        for(int i =0; i < repeat_num; i++) {
            result += num_array[i];
        }
        return (int)Math.round((double)result/repeat_num);
    }

    public int duplication(int[] num_array, int repeat_num) {
        int multi_count[] = new int[repeat_num]; //순위 정하기
        int count =1;
        int max =0;

        // 중복이지 않으면 1을, 중복이면 그 수 만큼 count해 마지막 수의 인덱스에 입력
        for(int i =0; i < repeat_num; i++) {
            if(i < repeat_num-1 && num_array[i] == num_array[i+1]) {
                count++;
            } else {
                multi_count[i] = count;
                if(multi_count[max] < multi_count[i]) {
                    max = i; // 최빈값을 찾음 
                }
                count = 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< repeat_num; i++) {
            if(multi_count[i] == multi_count[max]) {
                list.add(num_array[i]);
            }
        }
        
        if(list.size() == 1) {
            return list.get(0); // 1개라면 1번째 요소를
        } else {
            return list.get(1); // 2개 이상이라면 2번째 요소를
        }
    }

    public int range(int[] num_array, int repeat_num) {
        return num_array[repeat_num-1] - num_array[0];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Main show = new Main();

        int repeat_num = Integer.parseInt(input.readLine());
        int[] num_array = new int[repeat_num];

        for(int i =0; i< repeat_num; i++) {
            num_array[i] = Integer.parseInt(input.readLine());
        }
        Arrays.sort(num_array); // 오름차순

        output.write(String.valueOf(show.mean(num_array, repeat_num))+"\n"); // 평균
        output.write(String.valueOf(num_array[repeat_num/2])+"\n"); // 중앙값
        output.write(String.valueOf(show.duplication(num_array, repeat_num))+"\n");
        output.write(String.valueOf(show.range(num_array, repeat_num))); // 범위

        input.close();
        output.flush();
        output.close();
    }
}
