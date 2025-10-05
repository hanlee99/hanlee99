import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N=5;
        int M=5;
        int[][] arr = new int[5][5];

        for(int i=0; i<5; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                arr[i][j]=arr[i-1][j] + arr[i][j-1];
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