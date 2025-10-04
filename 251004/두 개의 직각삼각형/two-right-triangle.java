import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt();

        for(int i=N; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            for(int k=1; k<=(N-i)*2; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}