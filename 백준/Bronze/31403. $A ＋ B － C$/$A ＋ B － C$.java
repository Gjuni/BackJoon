import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int result_int =0;
        int result_string;

        result_int = A+B-C;
        String char_A = Integer.toString(A);
        String char_B = Integer.toString(B);
        // String char_C = Integer.toString(C);
        String aPb = char_A + char_B;

        result_string =Integer.parseInt(aPb)-C;


        System.out.println(result_int);
        System.out.println(result_string);
    }
}
