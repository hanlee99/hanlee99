import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;

        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.println(n/2);
                cnt++;
                if(cnt>=3){
                    break;
                }
            }
        }

    }
}