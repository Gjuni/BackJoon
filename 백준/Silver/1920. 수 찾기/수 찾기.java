import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static int binsearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] < key) {
                low = mid+1;
            } else if(arr[mid] > key) {
                high = mid -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int list_num = Integer.parseInt(input.readLine());
        String list_string = input.readLine().trim();
        StringTokenizer token1 = new StringTokenizer(list_string);
        int[] list_array = new int[list_num];
        for(int i =0; i< list_num; i++) {
            list_array[i] = Integer.parseInt(token1.nextToken());
        }
        Arrays.sort(list_array);

        int find_num = Integer.parseInt(input.readLine());
        StringTokenizer token2 = new StringTokenizer(input.readLine());
        
        for(int i =0; i< find_num; i++) {
            int find_value = Integer.parseInt(token2.nextToken());
            output.write(binsearch(list_array, find_value) + "\n");
        }

        output.flush();
        output.close();
        input.close();
    }
}