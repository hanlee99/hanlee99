import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int n=6;
        int sum=0;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            sum+=ability[i];
        }
        // Please write your code here.
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<=n-3; i++){
            for(int j=i+1; j<=n-2; j++){
                for(int k=j+1; k<=n-1; k++){
                    int a=ability[i]+ability[j]+ability[k];
                    int b=sum-a;
                    diff=Math.min(diff,Math.abs(a-b));
                }
            }
        }
        System.out.println(diff);
    }
}