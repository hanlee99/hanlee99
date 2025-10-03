import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(b>c){
            int temp=b;
            b=c;
            c=temp;
        }
        int res = b>a ? b : a;

        System.out.println(res);    
    }
}