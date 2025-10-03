import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        String res;

        if(a==0){
            res = b>=19 ? "MAN" : "BOY";
        }else{
            res = b>=19 ? "WOMAN" : "GIRL";
        }

        System.out.println(res);
    }
}