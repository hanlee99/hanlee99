import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        if(word1.length() != word2.length()) {
            System.out.println("No");
            return;
        }
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean flag = true;

        for(int i=0; i<c1.length; i++){
            if(c1[i] != c2[i]){
                flag=false;
                break;
            }
        }
        String res = flag ? "Yes" : "No";
        
        System.out.println(res);
    }
}