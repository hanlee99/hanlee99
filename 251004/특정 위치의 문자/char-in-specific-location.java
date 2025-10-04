import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = "LEBROS";
        String s = sc.next();
        String res = (st.indexOf(s) != -1) ? st.indexOf(s)+"" : "None";
        System.out.println(res);
    }
}