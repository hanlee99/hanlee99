import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String st = a>=80 ? "pass" : 80-a+ " more score";
        
        System.out.println(st);
    }
}