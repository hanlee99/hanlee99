import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        String res = palindrome(input);
        System.out.println(res);
    }
    private static String palindrome(String st){
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) != st.charAt(st.length()-1-i))
                return "No";
        }
        return "Yes";
    }
}