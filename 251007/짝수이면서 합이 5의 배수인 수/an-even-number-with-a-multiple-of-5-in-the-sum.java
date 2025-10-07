import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        String res = isEven(n)&&isFive(n) ? "Yes" : "No";

        System.out.println(res);
    }
    private static boolean isEven(int n){
        return (n%2==0);
    }
    private static boolean isFive(int n){
        int sum=(n%10) + (n/10);
        return (sum%5==0);
    }
}