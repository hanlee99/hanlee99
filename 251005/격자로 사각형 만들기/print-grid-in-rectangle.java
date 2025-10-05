import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = N;
        int[][] arr = new int[N][M];

        for(int n=0; n<N; n++){
            arr[0][n]=1;
            arr[n][0]=1;
        }

        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                int a=arr[i-1][j]+arr[i][j-1]+arr[i-1][j-1];
                arr[i][j]=a;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}