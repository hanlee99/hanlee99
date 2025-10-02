import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String st = (N%2!=0&&N%3==0) || (N%2==0&&N%5==0) ? "true"
        :"false";
        System.out.println(st);
    }
}