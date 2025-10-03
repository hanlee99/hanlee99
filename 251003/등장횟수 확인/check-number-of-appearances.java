import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}