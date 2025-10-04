import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);

        int N = sc.nextInt();
        String res="N";

        for(int i=2; i<=N/2; i++){
            if(N%i==0){
                res="C";
                break;
            }
        }
        System.out.println(res);
    }
}