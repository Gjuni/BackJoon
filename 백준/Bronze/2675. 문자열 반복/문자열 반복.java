import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row_count = input.nextInt();
        input.nextLine(); // 다음 줄로 이동

        String[] input_array = new String[row_count];
        String[][] split_array = new String[row_count][];
        String[][] result_array = new String[row_count][];

        for (int row = 0; row < row_count; row++) {
            int repeat_num = input.nextInt();
            input_array[row] = input.nextLine().trim(); // 개행 문자 제거

            int input_length = input_array[row].length();
            split_array[row] = new String[input_length];
            result_array[row] = new String[input_length * repeat_num];

            for (int i = 0; i < input_length; i++) {
                split_array[row][i] = String.valueOf(input_array[row].charAt(i));

                for (int j = 0; j < repeat_num; j++) {
                    result_array[row][i * repeat_num + j] = split_array[row][i];
                }
            }
        }

        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < result_array[i].length; j++) {
                if (result_array[i][j] != null) {
                    System.out.print(result_array[i][j]);
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}