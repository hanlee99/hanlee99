import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int res = arr[i][j] == sc.nextInt() ? 0 : 1;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}