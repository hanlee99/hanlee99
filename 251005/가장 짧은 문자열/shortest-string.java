import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int a=st.length();
        String st2 = sc.next();
        int b=st2.length();
        String st3 = sc.next();
        int c=st3.length();

        int max=Math.max(Math.max(a,b),c);
        int min=Math.min(Math.min(a,b), c);

        
        System.out.println(max-min);
    }
}