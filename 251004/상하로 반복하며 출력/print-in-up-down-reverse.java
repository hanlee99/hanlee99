import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int com=N+1;
        int cnt=1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                int res = j%2!=0 ? i : com-i;
                System.out.print(res);
            }
            System.out.println();
        }
    }
}