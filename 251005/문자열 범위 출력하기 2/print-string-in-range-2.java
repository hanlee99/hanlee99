import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        String word=sc.next();
        int N=sc.nextInt();

        for(int i=word.length()-1; i>=0; i--){
            
            System.out.print(word.charAt(i));
            cnt++;
            if(cnt==N) break;
        }
        
    }
}