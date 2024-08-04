import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        
        int repeat_num = Integer.parseInt(input.readLine());
        String[] string= new String[repeat_num];
        String token = input.readLine();
        string = token.split("");
        int total = 0;
        for(int i =0; i< repeat_num; i++) {
            int cal = 0;
            for(int j = 'a'; j <= 'z'; j++) {
                if(string[i].equals(Character.toString((char)j))) {
                    cal = (int)Math.pow(31,i)*(j-'a'+1);
                }
            }
            total += cal;
            map1.put(string[i], cal);
        }

        // Iterator<Map.Entry<String,Integer>> itr = map1.entrySet().iterator();
        // while(itr.hasNext()) {
        //     Map.Entry<String, Integer> entry2 = itr.next();
        //     total += entry2.getValue();
        // }

        output.write(String.valueOf(total));
        
        output.flush();
        input.close();
        output.close();
    }
}
