import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(countRecursionMagicNum(n));
    }
    private static int countRecursionMagicNum(int n){
        if(n==1) return 0;

        n = n%2==0 ? n/2 : n/3;
        return countRecursionMagicNum(n)+1;
    }
}