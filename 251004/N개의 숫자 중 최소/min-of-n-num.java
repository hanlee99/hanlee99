import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int res=sc.nextInt();
        int cnt=1;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(res>a){
                cnt=1;
                res = Math.min(res, a);
            }else if(res == a){
                cnt++;
            }
            
        }

        System.out.println(res + " " + cnt);

    }
}