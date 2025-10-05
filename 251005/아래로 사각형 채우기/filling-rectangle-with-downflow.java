import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = N;
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            int a=i+1;
            for(int j=0; j<M; j++){
                
                arr[i][j]=a;
                a+=N;
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