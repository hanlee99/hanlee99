import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        firstToLast(n);
        lastToFirst(n);
    }
    private static void firstToLast(int N){
        for(int i=1; i<=N; i++)  System.out.print(i+" ");
        System.out.println();
    }
    private static void lastToFirst(int N){
        for(int i=N; i>0; i--)  System.out.print(i+" ");
        System.out.println();
    }
}