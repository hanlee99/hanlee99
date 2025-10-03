import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        String head=A/B+"";
        A%=B;
        String tail="";
        while(tail.length()<20){
            A*=10;
            tail+=A/B;
            A%=B;
        }
        String res =head + "." + tail;
        System.out.println(res);

    }
}