import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int cnt=N;
            for(int j=1; j<=N; j++){
                String res= i<=j ? cnt+" " : "  "; 
                System.out.print(res);
                cnt--;
            }
            System.out.println();
        }
    }
}