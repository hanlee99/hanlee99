import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String res = new String(chars);
        System.out.println(res);
    }
}