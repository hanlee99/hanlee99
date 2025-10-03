import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int sum=0;
        while(sc.hasNext()){
            int a=sc.nextInt();

            if(a>=20 && a<=29){
                cnt++;
                sum+=a;
            }else{
                break;
            }
        }
        System.out.printf("%.2f", (double)sum/cnt);

    }
}