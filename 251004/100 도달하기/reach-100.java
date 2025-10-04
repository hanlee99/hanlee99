import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a=1;
        int b=N;
        System.out.print(a+" " + b + " ");
        while(b<=100){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}