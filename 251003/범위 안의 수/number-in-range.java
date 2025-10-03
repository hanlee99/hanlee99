import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        String res = a>=10 && a<=20 ? "yes" : "no";
        System.out.println(res);
        
    }
}