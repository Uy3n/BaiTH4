import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args){
        int num, remainder, reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        num = sc.nextInt();
        String s = String.valueOf(num);
        StringBuilder str = new StringBuilder(s);
        System.out.println(str.reverse().toString());
//        while (num != 0){
        //           remainder = num % 10;
//            reversed = reversed * 10 + remainder;
//            num = num / 10;
//        }
//        System.out.println(reversed);
    }
}
