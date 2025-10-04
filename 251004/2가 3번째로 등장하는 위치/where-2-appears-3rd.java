import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int cnt=0;
        int index=-1;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==2) cnt++;
            index++;
            if(cnt==3) break;
        }
        System.out.println(index+1);

    }
}