import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String st=sc.next();

            if(st.equals("END")) {
                break;
            }else{
                StringBuilder sb = new StringBuilder(st);
                System.out.println(sb.reverse());
            }
        }        
    }
}