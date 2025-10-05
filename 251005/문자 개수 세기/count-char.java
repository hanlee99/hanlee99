import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String s = sc.next();
        int res=0;
        char a=s.charAt(0);
        for(int i=0; i<st.length(); i++){
            if(a == st.charAt(i))   res++;
        }

        
        System.out.println(res);
    }
}