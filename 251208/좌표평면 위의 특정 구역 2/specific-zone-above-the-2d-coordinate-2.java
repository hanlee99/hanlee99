import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int square=Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            int xMax=Integer.MIN_VALUE;
            int xMin=Integer.MAX_VALUE;
            int yMax=Integer.MIN_VALUE;
            int yMin=Integer.MAX_VALUE;
            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }
                xMax = Math.max(xMax, x[j]);
                xMin = Math.min(xMin, x[j]);
                yMax = Math.max(yMax, y[j]);
                yMin = Math.min(yMin, y[j]);
            }
            square = Math.min(square, (xMax-xMin)*(yMax-yMin));
        }
        System.out.println(square);
    }
}