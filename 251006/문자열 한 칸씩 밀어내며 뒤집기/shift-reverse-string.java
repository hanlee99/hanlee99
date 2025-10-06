import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int Q=sc.nextInt();

        for(int i=0; i<Q; i++){
            int n=sc.nextInt();

            if(n==1){
                st = st.substring(1,st.length())+st.substring(0,1);
                System.out.println(st);
            }else if(n==2){
                st = st.substring(st.length()-1) + st.substring(0,st.length()-1);
                System.out.println(st);
            }else{
                st = new StringBuilder(st).reverse().toString();
                System.out.println(st);
            }
        }
    }
}