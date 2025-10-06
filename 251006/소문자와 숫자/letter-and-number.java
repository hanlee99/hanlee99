import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st=sc.next();

        for(char c : st.toCharArray()){
            if(c>='0'&&c<='9'){
                System.out.print(c);
            }else if(c>='a'&&c<='z'){
                System.out.print(c);
            }else if(c>='A'&&c<='Z'){
                System.out.print((char)(c+32));
            }
        }

    }
}