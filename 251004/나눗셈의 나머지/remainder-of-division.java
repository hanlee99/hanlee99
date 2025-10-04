import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        
        int A=sc.nextInt();
        int B=sc.nextInt();
        int sum=0;
        int[] arr = new int[B];
        while(A>=1){
            arr[A%B]++;
            A/=B;
        }
        for(int a : arr){
            sum+=(a*a);
        }
        System.out.println(sum);
    }
}