import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat_num = input.nextInt();   // 배열의 갯수
        int total[] = new int[repeat_num];
        input.nextLine();

        String ox[] = new String[repeat_num]; // 입력 받을 ox 초기 값
        String[][] split_ox = new String[repeat_num][]; // ox값을 한 글자씩 나눔

        for(int i =0; i< repeat_num; i++) {
            ox[i] = input.nextLine(); // 입력을 받고
            int len = ox[i].length(); // 길이 개산
            split_ox[i] = new String[len]; // len 동적할당 시켜 크기 지정

            for(int j =0; j < len; j++) {
                split_ox[i][j] = String.valueOf(ox[i].charAt(j)+"");
                // System.out.print(split_ox[i][j]);
            }
        }

        for(int i =0; i< repeat_num; i++) {
            int len = ox[i].length(); // 두번째  for문을 위한 수
            int score = 0;            // 연속적인 점수를 집계

            boolean x = false;        // x : false , o : true
            for(int j =0; j < len; j++) {
                if(split_ox[i][j].equals("O")) {
                    x = true;
                } else {
                    x = false;
                }

                if(x == true) {
                    score++;
                    total[i] += score;
                }
                else if(x == false) {
                    score = 0;
                }
            }
        }

        for(int i =0; i< repeat_num; i++) {
            System.out.println(total[i]);
        }
         

        input.close();
    }
}