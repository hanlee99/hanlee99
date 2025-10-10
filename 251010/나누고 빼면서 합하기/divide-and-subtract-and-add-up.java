import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(sumMagic(arr,m));
    }
    private static int sumMagic(int[] arr, int M){
        int sum=0;
        while(M>=1){
            sum+=arr[M];
            M = M%2==0 ? M/2 : M-1;

            
        }
        return sum;
    }
}