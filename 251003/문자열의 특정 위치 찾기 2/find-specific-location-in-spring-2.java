import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count=0;
        String[] words = {"apple", "banana", "grape",
        "blueberry", "orange"};
        char c = a.charAt(0);
        for(int i=0; i<words.length; i++){
            char threeSt = words[i].charAt(2);
            char fourSt = words[i].charAt(3);
            if(c==threeSt || c==fourSt){
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println(count);
    }
}