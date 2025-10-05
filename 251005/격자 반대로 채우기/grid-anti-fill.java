import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M=N;
        int[][] arr = new int[N][M];
        int a=1;
        for(int j=N-1; j>=0; j--){
            int n = (N-2)-j;
            int row = n%2!=0 ? N-1 : 0;
            int sign = n%2!=0 ? -1 : 1;

            for(int i=0; i<M; i++){
                arr[row][j]=a++;
                row+=sign;
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