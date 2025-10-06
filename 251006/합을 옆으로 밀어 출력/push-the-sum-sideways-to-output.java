import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        for(int i=0; i<N; i++){
            int n=sc.nextInt();
            sum+=n;
        }
        String st=sum+"";
        System.out.println(st.substring(1) + st.substring(0,1));
    }
}