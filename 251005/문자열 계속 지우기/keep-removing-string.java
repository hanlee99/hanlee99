import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A=sc.next();
        String B=sc.next();
        int n=B.length();
        StringBuilder sb = new StringBuilder(A);

        while(true){    
            int bcnt=0;
            int start=0;

            for(int i=0; i<sb.length();i++){
                char c = sb.charAt(i);
                if(c==B.charAt(bcnt)){
                    bcnt++;
                }else{
                    bcnt=c==B.charAt(0) ? 1 : 0;
                }
                if(bcnt==1) start=i;
                if(bcnt==n) break;
            }
            if(bcnt!=n) break;          
                
            StringBuilder sb2 = new StringBuilder();
            for(int i=0; i<sb.length(); i++){
                if(i>=start&&i<start+n){
                }else{
                    sb2.append(sb.charAt(i));
                }
            }
            sb=sb2;                     
        }
        System.out.println(sb.toString());
    }
}