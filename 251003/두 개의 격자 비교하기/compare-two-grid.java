import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);  
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int comp = sc.nextInt();
                int res = arr[i][j] == comp ? 0 : 1;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}