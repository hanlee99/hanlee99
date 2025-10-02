import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        String st;
        if(a>=100) st="vapor";
        else if(a>=0) st="water";
        else st="ice";
        System.out.println(st);
    }
}