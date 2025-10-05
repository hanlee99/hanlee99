import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i=word.length()-1; i>=0; i--){
            if((i+1)%2==0){
                System.out.print(word.charAt(i));
            }
        }
        
        
    }
}