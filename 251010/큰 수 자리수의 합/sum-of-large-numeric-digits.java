import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(sumDigit(a*b*c));
    }
    private static int sumDigit(int n){
        if(n<10) return n;

        return n%10 + sumDigit(n/10);
    }
}