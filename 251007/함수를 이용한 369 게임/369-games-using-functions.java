import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt=0;
        for(int i=A; i<=B; i++){
            if(isThree(i)) cnt++;
        }
        System.out.println(cnt);
    }
    private static boolean isThree(int a){
        if(a%3==0 || isHaveThree(a)) return true;
        else return false;
    }
    private static boolean isHaveThree(int a){
        while(a>0){
            int n=a%10;
            if(n==3 || n==6 || n==9) return true;
            a/=10;
        }
        return false;
    }
}