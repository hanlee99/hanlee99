import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0; i<8; i++){
            int sum=2*a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}