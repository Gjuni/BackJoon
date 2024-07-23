import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_num = 1;
        int reverse_num = 0;
        ArrayList<String> ys = new ArrayList<>(); // 동적 할당

        while(true) {
            input_num = input.nextInt();
            if(input_num == 0)
                break;
            reverse_num = 0;
            int copy_num = input_num;

            while(copy_num != 0) {
                reverse_num = reverse_num*10 + copy_num%10;
                copy_num = copy_num/10;
            }

            if(input_num == reverse_num) {
                ys.add("yes");
            } else {
                ys.add("no");                
            }
        }
        for(String copy : ys) {
            System.out.println(copy);
        }
        input.close();
    }
}