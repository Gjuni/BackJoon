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

        int holes_num = Integer.parseInt(input.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        if(holes_num == 0) {
            list.add(1);
        } else if(holes_num == 1) {
            list.add(0);
        }else {
            if(holes_num%2 == 1) {
                list.add(4);
                holes_num -= 1;
            }
            for(int i =0; i< holes_num/2; i++) {
                list.add(8);
            }
        }

        for(Integer num : list) {
            output.write(String.valueOf(num));
        }
        input.close();
        output.flush();
        output.close();
    }
}
