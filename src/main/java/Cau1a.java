import java.util.Scanner;

public class Cau1a {
    public static void main(String[] args){
        int num, original, remainder;
        int reversed = 0;
        boolean symetricnum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        num = sc.nextInt();
        original = num;
        while (num !=0){
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        if (original == reversed){
            symetricnum = true;
        } else {
            symetricnum = false;
        }
    }
}
