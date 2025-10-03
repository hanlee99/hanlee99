import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int res1 = a>b ? 1 : 0;
        int res2 = a>c ? 1 : 0;
        int res3 = a>d ? 1 : 0;
        int res4 = a>e ? 1 : 0;
        System.out.println(res1+"\n"+res2+"\n"+res3+"\n"+res4);
    }
}