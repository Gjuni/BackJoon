/**
 *  문제 이름 : 회의실 배정
 * 
 *  난 이  도 : 골드 5
 * 
 *  아이디어 : 
 *              최대로 배정 가능한 회의 갯수를 구하여라
 *              전형적인 회의실 배정 문제
 * 
 *  해    설 : 
 * 
 *  시간 복잡도 : 
 * 
 *  공간 복잡도 : 
 *    
 */


import java.io.*;
import java.util.*;

class TimeLine implements Comparable<TimeLine>{
    int start;
    int end;

    public TimeLine(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(TimeLine time) {
        if (this.end == time.end) {
            return this.start - time.start;
        }

        return this.end - time.end;
    }
}

 public class Main {
     static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     static BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int solve(PriorityQueue<TimeLine> list) throws IOException{
        int answer = 0;

        TimeLine first_temp = list.poll();

        int start = first_temp.start;
        int end = first_temp.end;
        answer++;

        while(!list.isEmpty()) {
            TimeLine value = list.poll();

            int compare_start = value.start;
            int compare_end = value.end; // null point exception

            if(end <= compare_start) {
                end = compare_end;
                start = compare_start;

                answer++;
            }
        }

        return answer;
    }

     public static void main(String[] args) throws IOException{
         int num = Integer.parseInt(input.readLine());

         PriorityQueue<TimeLine> list = new PriorityQueue<>();

         for (int i = 0; i < num; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());

            int start = Integer.parseInt(token.nextToken());
            int end = Integer.parseInt(token.nextToken());

            list.add(new TimeLine(start, end));
         }

        //  for(TimeLine line : list) {
        //     output.write(String.valueOf(line.start) + " "+ String.valueOf(line.end)+"\n");
        //  }

         output.write(String.valueOf(solve(list)));

         input.close();
         output.close();
     }
 }