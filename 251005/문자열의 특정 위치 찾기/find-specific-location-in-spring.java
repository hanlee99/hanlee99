import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        String ch = sc.next();
        
        int check=word.indexOf(ch);
        String res= check!=-1 ? check+"" : "No";

        System.out.println(res);
        

        
        
    }
}