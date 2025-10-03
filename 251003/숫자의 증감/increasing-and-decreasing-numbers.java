import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String C=sc.next();
        int N=sc.nextInt();

        int comp = C.equals("A") ? 1 : N;
        int sign = comp!=1 ? -1 : 1;

        for(int i=0; i<N; i++){
            System.out.print(comp+(i*sign) + " ");
        }
    }
}