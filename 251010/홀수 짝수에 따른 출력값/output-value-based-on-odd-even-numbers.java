import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sumMinusTwo(n));
    }
    private static int sumMinusTwo(int n){
        if(n<=1) return n;

        return n + sumMinusTwo(n-2);
    }
}