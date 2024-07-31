import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringbuilder = new StringBuilder();

        StringTokenizer token = new StringTokenizer(input.readLine());
        Queue<Integer> yocepus = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
        int size_Queue = Integer.parseInt(token.nextToken());
        int idx = Integer.parseInt(token.nextToken());

        for(int i =0; i< size_Queue; i++) {
            yocepus.add(i+1);
        }

        int countDown = 0;

        while(!(yocepus.isEmpty())) {
            countDown++;
            if(countDown == idx) {
                result.add(yocepus.remove());
                countDown = 0;
            } else {
                yocepus.add(yocepus.remove());
            }
        }
        
        stringbuilder.append("<");
        while(!result.isEmpty()) {
            stringbuilder.append(result.poll());

            if(!result.isEmpty()) {
                stringbuilder.append(", ");
            }
        }
        stringbuilder.append(">");

        output.write(String.valueOf(stringbuilder));

        output.flush();
        output.close();
        input.close();
    }
}
