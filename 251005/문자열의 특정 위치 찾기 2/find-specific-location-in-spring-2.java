import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String[] words = {"apple","banana","grape","blueberry","orange"};
        int res=0;

        for(String st : words){
            if(c==st.charAt(2) || c==st.charAt(3)){
                System.out.println(st);
                res++;
            }
        }
        
        System.out.println(res);
    }
}