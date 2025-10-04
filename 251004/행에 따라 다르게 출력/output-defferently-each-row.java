import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int k=i%2!=0 ? 1 : 2;
            for(int j=1; j<=N; j++){
                cnt+=k;
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
    }
}