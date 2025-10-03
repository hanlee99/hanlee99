import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int n = sc.nextInt();
                arr[i][j] = n*3;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}