import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        char[] ch = st.toCharArray();
        ch[1] = 'a';
        ch[st.length()-2] = 'a';
        st = new String(ch);
        System.out.println(st);
    }
}