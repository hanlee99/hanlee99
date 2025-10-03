import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int num = i%2 == 0 ? 1 : N;
            int add = i%2 == 0 ? 1 : -1;
            for(int j=0; j<N; j++){
                System.out.print(num+(add*j));
            }
            System.out.println();
        }
    }
}