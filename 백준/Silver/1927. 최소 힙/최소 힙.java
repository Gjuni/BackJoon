import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0; i< repeat_num; i++) {
            int num = Integer.parseInt(input.readLine());
            
            if(num == 0) {
                if(minHeap.isEmpty()) {
                    output.write(String.valueOf(0)+"\n");
                } else {
                    output.write(String.valueOf(minHeap.poll())+"\n");
                }
            } else {
                minHeap.offer(num);
            }
            
        }

        input.close();
        output.close();
    }
}
