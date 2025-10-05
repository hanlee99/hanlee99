import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String res = (word.contains("ee")) ? "Yes":"No";
        System.out.print(res+" ");

        res = (word.contains("ab")) ? "Yes" : "No";
        System.out.print(res);
        
    }
}