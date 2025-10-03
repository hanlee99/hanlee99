import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++){
            int num = N+1;
            for(int j=0; j<N; j++){
                arr[i][j] = j%2==0 ? i+1 : num-(i+1);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}