import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int money=sc.nextInt();

        String st;
        if(money>=3000) st="book";
        else if(money>=1000) st="mask";
        else st="no";
        System.out.println(st);
    }
}