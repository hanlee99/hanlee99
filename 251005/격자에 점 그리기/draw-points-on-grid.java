import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][N];

        int num=1;
        
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a-1][b-1]=num++;
        }
        

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}