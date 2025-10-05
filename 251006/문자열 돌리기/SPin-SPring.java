import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        StringBuilder sb = new StringBuilder(st);
        System.out.println(sb.toString());
        for(int i=0; i<st.length(); i++){
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.substring(sb.length()-1));
            sb2.append(sb.substring(0,sb.length()-1));
            sb =  sb2;
            System.out.println(sb.toString());
        }
    }
}