import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        int cnt=0;
        while(sc.hasNext()){
            int sum=0;
            for(int i=0; i<4; i++){
                int a=sc.nextInt();
                sum+=a;
            }
            int avg=sum/4;
            if(avg>=60){
                cnt++;
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}