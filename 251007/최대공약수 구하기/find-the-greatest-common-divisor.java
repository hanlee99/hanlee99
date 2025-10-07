import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int gcd=getGcd(n, m);
        System.out.println(gcd);
    }
    private static int getGcd(int n, int m){
        if(m==0) return n;

        return getGcd(m, n%m);
    }
}