import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int cnt=i%2!=0?1 :N;
            int sign=i%2!=0 ? 1 : -1;
            for(int j=1; j<=N; j++){
                System.out.print(cnt);
                cnt+=sign;
            }
            System.out.println();
        }
    }
}