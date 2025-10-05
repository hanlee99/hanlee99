import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st2 = sc.next();
        String res;

        if(st.length()>st2.length()){
            res=st+" "+st.length();
        }else if(st.length() == st2.length()){
            res="same";
        }else{
            res=st2 + " " + st2.length();
        }
        System.out.println(res);
    }
}