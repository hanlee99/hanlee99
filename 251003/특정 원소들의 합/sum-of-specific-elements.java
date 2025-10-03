import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);  
        int sum=0;

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                int n=sc.nextInt();
                if(j<=i){
                    sum+=n;
                }
            }
        }
        System.out.println(sum);
    }
}