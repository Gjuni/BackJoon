import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException{
        // 5부터 탐색 그 후 5의 갯수 -1
        // 3은 5가 빠질 때 초기 값보다 커지기 전만큼 넣음
        // 그랬을 때 5가 0 3이 최다 갯수임에도 초기 그램보다 초과된다면 -1

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int kg = Integer.parseInt(input.readLine());
        int kg_5 = kg/5;
        int kg_3 = 0;
        int result = kg_5+kg_3;
        
        while(true) {
            if(kg_5 < 0) {
                result = -1;
                break;
            } else if(kg > kg_5*5 + kg_3*3) {
                kg_3++;
            } else if(kg < kg_5*5 + kg_3*3) {
                kg_5--;
            }  else if((kg_5*5+kg_3*3) == kg) {
                result = kg_5+kg_3;
                break;
            }
        }
        output.write(String.valueOf(result));
        output.flush();
        
        input.close();
        output.close();
    }
}
