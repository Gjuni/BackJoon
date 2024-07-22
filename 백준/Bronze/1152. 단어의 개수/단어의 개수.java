import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** bufferReader는 8192char (16,384Byte)
  *  Scanner 는 1024char
  *  bufferReader가 더 빠름
  */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader((System.in))); // 선언
        String string = input.readLine().trim();
        
        if(string.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = string.split("\\s+"); // 하나 이상의 공백문자 즉 여러개의 공백문자가 있어도 1개로 인식함
            int count_word = arr.length;
            System.out.println(count_word);
        }
    }
}