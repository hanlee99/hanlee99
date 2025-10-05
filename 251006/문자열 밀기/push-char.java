import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int n=st.length();
        System.out.println(st.substring(1,n)+st.substring(0,1));
    }
}