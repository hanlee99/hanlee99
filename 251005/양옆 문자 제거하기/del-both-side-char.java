import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();

        System.out.println(word.substring(0,1)+
                            word.substring(2,word.length()-2)+
                            word.substring(word.length()-1));

        
    }
}