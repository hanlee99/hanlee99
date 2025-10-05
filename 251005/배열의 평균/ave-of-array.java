import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int sum = 0;
    
        for(int i=0; i<2; i++){
            int row_Sum=0;
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                row_Sum+=arr[i][j];
                
            }
            sum+=row_Sum;
            System.out.printf("%.1f ",(double)row_Sum/4);
        }
        System.out.println();

        for(int j=0; j<4; j++){
            int colSum=0;
            for(int i=0; i<2; i++){
                colSum+=arr[i][j];
            }
            System.out.printf("%.1f ", (double)colSum/2);
        }
        System.out.println();

        System.out.printf("%.1f", (double)sum/8);
    }
}