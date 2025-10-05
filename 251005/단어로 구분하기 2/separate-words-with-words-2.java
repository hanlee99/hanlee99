import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int res=0;
        while(sc.hasNext()){
            String word = sc.next();
            res++;
            if(res%2!=0)
                System.out.println(word);
        }
        
    }
}