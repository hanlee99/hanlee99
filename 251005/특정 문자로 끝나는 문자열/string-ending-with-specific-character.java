import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] words = new String[10];
        
        for(int i=0; i<10; i++){
            words[i]=sc.next();
        }
        int cnt=0;
        char c=sc.next().charAt(0);
        for(int i=0; i<words.length; i++){
            if(words[i].charAt(words[i].length()-1) == c){
                System.out.println(words[i]);
                cnt++;
            }
        }
        if(cnt==0) System.out.println("None");
        
    }
}