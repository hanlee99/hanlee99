import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt();
        for(int i=1; i<=N*2; i++){
            int in = i<=N ? i : N+1 - (i-N);
            if(in%2!=0&&in<=N || in%2==0&&in>N){
                for(int j=1; j<=(in+1)/2; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=in/2; j<=N; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}