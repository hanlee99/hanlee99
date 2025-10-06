import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        char c=st.charAt(0);
        c = c=='z' ? 'a' : (char)(c+1);
        System.out.print(c);
    }
}