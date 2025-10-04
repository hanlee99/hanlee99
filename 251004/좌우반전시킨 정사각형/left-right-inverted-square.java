import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num=N;

        for(int i=1; i<=N; i++){
            for(int j=0; j<N; j++){
                System.out.print((num-(i*j)) + " ");
            }
            num+=N;
            System.out.println();
        }
    }
}