import java.util.Scanner;

public class Cau1b {
    public static void main(String[] args){
        int n;
        boolean squarenum = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++){
            if (i * i == n){
                squarenum = true;
            }
        }
        System.out.println(squarenum);
        }
    }

