import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int sum=1;
        int aDiff = countNum(n, a);
        int bDiff = countNum(n, b);
        int cDiff = countNum(n, c);

        System.out.println((n*n*n-aDiff*bDiff*cDiff));
    }
    private static int countNum( int n, int i){
        if(i==n || i==1){
            return (n-3>=0) ? n-3 : 0;
        }else if(i==n-1 || i==2){
            return n-4>=0 ? n-4 : 0;
        }else{
            return n-5>=0 ? n-5 : 0;
        }
    }
}