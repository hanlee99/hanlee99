import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int res=0;
        int price=sc.nextInt();
        for(int i=1; i<N; i++){
            int a=sc.nextInt();
            if(res<a-price){
                res=a-price;
            }
            if(price>a){
                price=a;
            }
        }
        System.out.println(res);
    }
}