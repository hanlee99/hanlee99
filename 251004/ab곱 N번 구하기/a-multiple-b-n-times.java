import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=1;

            for(int i=a; i<=b; i++){
                sum*=i;
            }
            System.out.println(sum);
        }
    }
}