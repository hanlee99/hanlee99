import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();

        int b = 10000*w/(h*h);
        String st = (b>=25) ? "Obesity" : "";
        System.out.println(b + "\n" + st);
    }
}