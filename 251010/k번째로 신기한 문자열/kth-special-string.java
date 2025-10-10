import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        int count=0;
        int idx=0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(t)){
                count++;
                idx=i;
            }
            if(count==k) break;
        }
        System.out.println(words[idx]);
    }
}