import java.util.Scanner;

public class Cau2d {
    public static void main(String[] args){
        int n;
        int multi = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            multi *= i;
        }
    }
}
