import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        
        while(sc.hasNext()){
            int a=sc.nextInt();
            
            int cnt=0;

            while(a>1){
                a = (a%2==0) ? a/=2 : a*3+1;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}