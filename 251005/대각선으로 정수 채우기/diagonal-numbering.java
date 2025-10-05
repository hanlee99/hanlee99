import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int a=1;

        for(int j=0; j<M; j++){
            int row=0;
            int col=j;
            while(row<N && col>=0){
                arr[row][col] = a++;
                row++;
                col--;
            }
        }
        for(int i=1; i<N; i++){
            int col=M-1;
            int row=i;
            while(row<N && col>=0){
                arr[row][col] = a++;
                row++;  col--;
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