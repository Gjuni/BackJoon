import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // repeat_num 테스트 테이터
        // H = 높이 W = 넓이 N = 원하는 방

        Scanner input = new Scanner(System.in);
        int repeat_num = input.nextInt();
        int info[][] = new int[repeat_num][3]; // H, W, N 순으로 (H*100 + W) ouput

        for(int i =0; i< repeat_num; i++) {
            for(int j =0; j < 3; j++) {
                info[i][j] = input.nextInt();
            }
        }
        // H값++; 만약 H값이 최대면 W값++; H값은 1로 그리고 H값++; 그 와중에 N값--;
        int room_num[] = new int[repeat_num];
        
        for(int i =0; i < repeat_num; i++) {
            int height = 0;
            int width = 1;
            for(int j = 0; j < info[i][2]; j++) {
                if(height == info[i][0]) {
                    height = 1;
                    width++;
                } else {
                    height++;
                }
            }
            room_num[i] = height*100 + width;
        }
        
        for(int i =0; i < repeat_num; i++) {
            System.out.println(room_num[i]);
        }
        input.close();
    }
}