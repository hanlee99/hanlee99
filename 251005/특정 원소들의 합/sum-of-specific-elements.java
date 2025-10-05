import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int a=sc.nextInt();
                if(j<=i)
                    sum+=a;
            }
            
        }System.out.println(sum);
    }
}