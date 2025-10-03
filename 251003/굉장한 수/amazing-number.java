import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        String res = (a%2!=0&&a%3==0) || (a%2==0&&a%5==0) ? 
        "true" : "false";
        System.out.println(res);
    }
}