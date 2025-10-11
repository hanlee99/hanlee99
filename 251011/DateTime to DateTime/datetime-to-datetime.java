import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int sum=0;
        int minute1 = A*24*60+B*60+C;
        int minute2 = 11*24*60+11*60+11;
        int res = minute1>=minute2 ? minute1-minute2 : -1;
        System.out.println(res);
    }
}