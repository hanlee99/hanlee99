import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B = sc.next();
        
        int cnt=0;

        for(int i=0; i<A.length()-1; i++){
            if(B.equals(A.charAt(i)+""+A.charAt(i+1)))
                cnt++;
        }
        System.out.println(cnt);
        
        
    }
}