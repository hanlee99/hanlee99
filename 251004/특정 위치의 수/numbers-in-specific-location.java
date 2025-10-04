import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=-1;
        int sum=0;

        while(sc.hasNext()){
            int a=sc.nextInt();
            cnt++;
            if(cnt==2||cnt==4||cnt==9){
                sum+=a;
            }
        }
        System.out.println(sum);
    }
}