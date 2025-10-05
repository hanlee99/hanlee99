import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();

        char[] arr = word.toCharArray();

        while(sc.hasNext()){
            int a=sc.nextInt();
            int n=word.length();
            if(a>=n) a=n-1;
            word = word.substring(0,a) + word.substring(a+1,n);
            System.out.println(word);
        }
        
    }
}