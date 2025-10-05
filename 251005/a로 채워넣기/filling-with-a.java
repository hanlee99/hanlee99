import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();

        char[] arr = word.toCharArray();

        arr[1]='a';
        arr[arr.length-2] = 'a';
        System.out.println(String.valueOf(arr));
    }
}