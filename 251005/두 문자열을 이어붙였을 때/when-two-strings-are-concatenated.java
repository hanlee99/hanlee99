import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a=sc.next();    String b=sc.next();
        String st1=a+b;     String st2=b+a;
        
        String res=st1.equals(st2) ? "true" : "false";
        System.out.println(res);
        

        
        
    }
}