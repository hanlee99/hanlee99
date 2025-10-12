import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int Adec = toDec(A, N);
        String res = toBase(B, Adec);
        System.out.println(res);

    }
    private static int toDec(int A, String N){
        int n=0;
        for(int i=0; i<N.length(); i++){
            int k = N.charAt(i)-'0';
            n = n*A + k;
        }
        return n;
    }
    private static String toBase(int A, int n){
        StringBuilder sb = new StringBuilder();
        do{
            sb.append(n%A);
            n/=A;
        }while(n>0);
        return sb.reverse().toString();
    }
}