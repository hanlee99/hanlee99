import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a<250){
                sum+=a;
                cnt++;
            }else{
                break;
            }
            
        }
        System.out.printf("%d %.1f",sum, (double)sum/cnt);
    }
}