import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int min = MAX;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i=1; i<n-1; i++){
            int sum=0;
            int prev=0;
            int pass=i;
            for(int j=1; j<n; j++){
                if(j!=pass){
                    int dist=manhattanDistance(x[prev],x[j],y[prev],y[j]);
                    sum+=dist;
                    prev=j;
                    //System.out.print(i+" "+j+" "+dist+" ");
                }
                
            }
            
            min=Math.min(min, sum);
            //System.out.println(min+" "+sum);
        }
        System.out.println(min);
    }

    public static int manhattanDistance(int x1,int x2,int y1, int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}