import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String st;
        if(a>=90) st="A";
        else if(a>=80) st="B";
        else if(a>=70) st="C";
        else if(a>=60) st="D";
        else st="F";
        System.out.println(st);
    }
}