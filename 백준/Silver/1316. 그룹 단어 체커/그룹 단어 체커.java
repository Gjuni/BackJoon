import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        String[] array = new String[repeat_num];
        int result = 0;
        
        for(int i =0; i< repeat_num; i++) {
            array[i] = input.readLine();
            int count = 0;
            ArrayList<Character> list = new ArrayList<>();
            
            for(int j = 0; j< array[i].length(); j++) {
                if(j < array[i].length()-1 && array[i].charAt(j) != array[i].charAt(j+1)) {
                    if(list.contains(Character.valueOf(array[i].charAt(j)))) { // 이미 존재한다면
                        count++;
                    } else {
                        list.add(array[i].charAt(j));
                    }
                }
                if(j == array[i].length()-1 && list.contains(Character.valueOf(array[i].charAt(j)))) {
                    count++;
                } 
            }
            if(count == 0) {
                result++;
            }
        }

        output.write(String.valueOf(result));
        input.close();
        output.flush();
        output.close();
    }
}
