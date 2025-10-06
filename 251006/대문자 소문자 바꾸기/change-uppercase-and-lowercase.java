import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st=sc.next();

        for(char c : st.toCharArray()){
            if(c>='A'&&c<='Z'){
                System.out.print((char)(c+32));
            }else{
                System.out.print((char)(c-32));
            }
        }
        
    }
}