import java.util.Scanner;

// for(char i ="a"; i <= "z"; i++) {
        //     System.out.print(""");
        //     System.out.print(i);
        //     System.out.print(""");
        //     System.out.print(",");
        // }

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int check[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
         
        int len = string.length();
        String split_arr[] = new String[len];

        // 위치에 따른 인덱스 값
        for(int i =0; i < len; i++) {
            split_arr[i] = string.charAt(i)+"";

            for(int alp = 0; alp < 26; alp++) {
                if(split_arr[i].equals(alpha[alp])) {
                    if(check[alp] == -1) {
                        check[alp] = i;   
                    }
                }
            }
        }
        // 중복처리
        for(int i = 'a'; i <= 'z'; i++) {
            System.out.print(check[i-'a']);
            System.out.print(" ");
        }
        input.close();
    }
}
