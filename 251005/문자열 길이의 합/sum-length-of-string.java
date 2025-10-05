import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int res=0;
        int aCnt=0;
        int a=sc.nextInt();
        while(sc.hasNext()){
            String st=sc.next();
            res+=st.length();
            if(st.charAt(0) == 'a') aCnt++;
        }
        System.out.println(res + " " + aCnt);
        
    }
}