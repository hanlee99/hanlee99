import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int res= a%3==0 || a%5==0 ? 1 : 0;
        System.out.println(res);
    }
}