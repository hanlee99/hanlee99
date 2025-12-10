import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] topNbottom = new int[n*2];
        for(int i=0; i<n; i++){
            topNbottom[i] = top[i];
        }
        for(int i=n; i<2*n; i++){
            topNbottom[i] = bottom[i-n];
        }
        for(int i=0; i<t; i++){
            int temp=topNbottom[2*n-1];
            for(int j=2*n-1; j>0; j--){
                topNbottom[j]=topNbottom[j-1];
            }
            topNbottom[0] = temp;
        }

        for(int i=0; i<2*n; i++){
            System.out.print(topNbottom[i]+" ");
            if(i==n-1) System.out.println();
        }
    }
}