import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int res=0;
        String word = sc.next();
        
        for(char c : word.toCharArray()){
            System.out.println(c);
        }
        
    }
}