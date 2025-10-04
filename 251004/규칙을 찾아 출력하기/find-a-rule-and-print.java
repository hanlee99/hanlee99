import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=N-1; i++){
            for(int j=1; j<=N; j++){
                if(j<=i || j==N){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}