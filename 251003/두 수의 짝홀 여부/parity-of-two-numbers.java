import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String stA = a%2==0 ? "even" : "odd";
        String stB = b%2==0 ? "even" : "odd";
        System.out.println(stA + "\n" + stB);
    }
}