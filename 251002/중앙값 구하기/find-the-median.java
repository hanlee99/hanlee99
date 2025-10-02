import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(); 
        int B=sc.nextInt();
        int C=sc.nextInt();
        int mid=B;
        if(A>B) {
            B=A;
            A=mid;
            mid=B;
        }
        if(B>C){
            if(C<A){
                mid=A;
            }else{
                mid=C;
            }
        }
        System.out.print(mid);
    }
}