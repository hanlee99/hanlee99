import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            int cnt=0;
            for(int j=1; j<=N-i+1; j++){
                if(cnt>0){
                    System.out.print(" / ");
                }
                System.out.print(i+" * "+j+" = "+i*j);
                cnt++;
                
            }
            System.out.println();
        }
    }
}