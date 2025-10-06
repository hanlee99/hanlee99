import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st=sc.next();
        int sum=0;
        for(int i=0; i<st.length(); i++){
            char c=st.charAt(i);
            sum+=Integer.parseInt(c+"");
        }
        System.out.println(sum);
    }
}