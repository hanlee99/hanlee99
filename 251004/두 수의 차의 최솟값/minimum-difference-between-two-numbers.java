import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int a=sc.nextInt();        
        int res=100;
        for(int i=1; i<N; i++){
            int b=sc.nextInt();
            if(res>b-a){
                res=b-a;
            }
            a=b;
        }
        System.out.println(res);
    }
}