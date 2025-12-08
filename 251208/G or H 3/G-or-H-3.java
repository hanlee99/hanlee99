import java.util.Scanner;
public class Main {        
    public static final int MAX_NUM = 10000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] point = new int[n];
        int[] score = new int[n];
        int[] lines = new int[MAX_NUM+1];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            lines[pos] = c=='G' ? 1 : 2;
        }
        // Please write your code here.

        int res=0;
        for(int i=1; i<=MAX_NUM-k; i++){
            int maxPoint=0;
            for(int j=0; j<=k; j++){
                maxPoint+=lines[i+j];
            }
            res = Math.max(res, maxPoint);
            //System.out.println(res+" "+maxPoint);
        }
        System.out.println(res);

    }
}