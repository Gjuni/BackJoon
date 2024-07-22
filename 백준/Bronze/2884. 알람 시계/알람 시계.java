import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 45분 일찍 알람 성정하기
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt(); // hour : 0에서 23
        int min = input.nextInt(); //  min : 0에서 59

        // min이 45보다 크다면 그냥 빼기
        // min이 45보다 작다면 hour를 빼고 (min - 45 + 60)
            // 이때 hour가 0 이라면 23으로 변경

        if(min >= 45) {
            System.out.print(hour);
            System.out.print(" ");
            System.out.print(min-45);
        } else if(min < 45) {
            if(hour > 0) {
                System.out.print(hour-1);
                System.out.print(" ");
                System.out.print(min - 45 + 60);
            } else {
                System.out.print(23);
                System.out.print(" ");
                System.out.println(min-45+60);
            }
        }

        input.close();
    }
}
