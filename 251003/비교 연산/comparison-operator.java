import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int res1 = a>=b ? 1 : 0;
        int op1 = b>=a ? 1 : 0;

        int res2 = a>b ? 1 : 0;
        int op2 = b>a ? 1 : 0;

        int res3 = a==b ? 1 : 0;
        int op3 = a!=b ? 1 : 0;
        System.out.println(res1 + "\n" + res2);
        System.out.println(op1 + "\n" + op2);
        System.out.println(res3 + "\n" + op3);
    }
}