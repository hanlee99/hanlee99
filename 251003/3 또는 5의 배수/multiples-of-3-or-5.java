import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String res1 = a%3==0 ? "YES" : "NO";
        String res2 = a%5==0 ? "YES" : "NO";
        System.out.println(res1 + "\n" + res2);
    }
}