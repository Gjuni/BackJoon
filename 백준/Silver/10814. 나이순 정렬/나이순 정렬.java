import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat_num = Integer.parseInt(input.readLine());
        String info[][] = new String[repeat_num][2];

        for(int i =0; i< repeat_num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            info[i][0] = token.nextToken();
            info[i][1] = token.nextToken();
        }

        Arrays.sort(info, new Comparator<String []>() {
            public int compare(String[] a, String[] b) {
                return (Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
            }
        });
        
        // for(int i = repeat_num-1; i >= 0; i--) {
        //     for(int j = i-1; j >= 0; j--) {
        //         if(age[i]  age[j]) {
        //             int temp = age[i];
        //             age[i] = age[j];
        //             age[j] = temp;
        //             String temp2 = name[i];
        //             name[i] = name[j];
        //             name[j] = temp2;
        //         }
        //     }
        // }

        for(int i =0; i< repeat_num; i++) {
            output.write(info[i][0] + " "+info[i][1]+"\n");
        }
        
        input.close();
        output.flush();
        output.close();
    }
}
