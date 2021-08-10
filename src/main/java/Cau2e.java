import java.util.Scanner;

public class Cau2e {
    public static void main(String[] args){
        int n;
        int multi = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            multi *= i;
            sum += multi;
        }
    }
}

