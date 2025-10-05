import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=3;
        int M=3;
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] * sc.nextInt()+" ");
            }
            System.out.println();
        }
    }
}