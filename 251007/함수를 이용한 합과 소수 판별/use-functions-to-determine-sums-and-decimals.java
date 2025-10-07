import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for(int i=A; i<=B; i++){
            if(isPrime(i)&&isSumEven(i)) cnt++;
        }
        System.out.println(cnt);

    }
    private static boolean isPrime(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    private static boolean isSumEven(int n){
        int sum=0;
        while(n>0){
            sum+= (n%10);
            n/=10;
        }
        if(sum%2==0) return true;
        else return false;
    }
}