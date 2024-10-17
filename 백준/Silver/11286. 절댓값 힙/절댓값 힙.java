import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat_num = Integer.parseInt(input.readLine());
        PriorityQueue<Integer> positiveHeap = new PriorityQueue<>();
        PriorityQueue<Integer> negativeHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i< repeat_num; i++) {
            int num = Integer.parseInt(input.readLine());


            if(num == 0) {
                if(positiveHeap.isEmpty() && negativeHeap.isEmpty()) {
                    output.write(String.valueOf(0)+"\n");
                } else {
                    if(!negativeHeap.isEmpty() && positiveHeap.isEmpty()) {
                        output.write(String.valueOf(negativeHeap.poll())+"\n");
                    } else if(negativeHeap.isEmpty() && !positiveHeap.isEmpty()) {
                        output.write(String.valueOf(positiveHeap.poll())+"\n");
                    } else {
                        int nega = negativeHeap.peek();
                        int posi = positiveHeap.peek();

                        nega *= -1;

                        if(nega <= posi) {
                            output.write(String.valueOf(negativeHeap.poll())+"\n");
                        } else {
                            output.write(String.valueOf(positiveHeap.poll())+"\n");
                        }
                    }
                }
            } else {
                if(num < 0) {
                    negativeHeap.add(num);
                } else {
                    positiveHeap.add(num);
                }
            }
            
        }

        input.close();
        output.close();
    }
}
