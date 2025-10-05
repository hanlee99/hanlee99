import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(sc.next());
        }
        String st=sb.toString();
        System.out.print(st.charAt(0));
        for(int i=1; i<st.length(); i++){
            char c=st.charAt(i);
            if(i%5==0){
                System.out.print("\n" + c);
            }else{
                System.out.print(c);
            }
        }
        

        
        
    }
}