import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        for(int i=1; i<=4; i++){
            int cnt=0;
            int n=i*2;
            for(int j=Math.max(A,B); j>=Math.min(A,B); j--){
                
                if(cnt>0){
                    System.out.print(" / ");
                }
                cnt++;
                System.out.print(j+" * "+n+" = "+j*n);
                
            }
            System.out.println();
        }
    }
}