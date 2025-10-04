import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();

        String res="P";
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                res="C";
                break;
            }
        }
        System.out.println(res);
    }
}