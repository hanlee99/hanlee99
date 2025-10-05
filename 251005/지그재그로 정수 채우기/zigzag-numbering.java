import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int a=0;

        for(int j=0; j<M; j++){
            int row = j%2==0 ? 0 : N-1;
            int sign = j%2==0 ? 1 : -1;
            for(int i=0; i<N; i++){
                arr[row + sign*i][j]=a++;
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