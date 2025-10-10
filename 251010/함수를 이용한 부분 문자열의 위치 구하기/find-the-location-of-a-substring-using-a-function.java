import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        System.out.println(hasPattern(text, pattern));
    }

    private static String hasPattern(String text, String pattern){
        return text.indexOf(pattern)+"";
    }
}