import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        String word2=sc.next();

        System.out.println(word.substring(0,2) + word2.substring(2));

        
    }
}