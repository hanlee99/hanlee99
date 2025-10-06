import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st=sc.next();

        int res=0;
        for(char c : st.toCharArray()){
            if(c>='0'&&c<='9'){
                res+= Integer.parseInt(c+"");
            }
        }
        System.out.print(res);
    }
}