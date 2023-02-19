import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long total = a-b;
            if(total < 0)
            {
                total *= -1;
            }

            System.out.println(total);
        }
    }
}
