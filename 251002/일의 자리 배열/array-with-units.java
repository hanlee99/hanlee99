import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        a[0] = sc.nextInt();    a[1] = sc.nextInt();
        for(int i=2; i<10; i++){
            a[i] = a[i-1] + a[i-2];
            a[i] %= 10;
        }
        for(int b : a) {
            System.out.print(b + " ");
        }
    }
}