import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = getGcd(1920, 2880);
        int res=0;
        for(int i=Math.min(A,B); i<=Math.max(A,B); i++){
            if(gcd%i == 0){
                res=1;
                break;
            }
        }

        System.out.println(res);
    }
    static private int getGcd(int a, int b){
        if(b==0) return a;
        
        return getGcd(b, a%b);
        
    }
}