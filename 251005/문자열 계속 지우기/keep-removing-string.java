import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A=sc.next();
        String B=sc.next();
        int n=B.length();
        StringBuilder sb = new StringBuilder(A);
        int[] lps = new int[n];

        int k=1; int len=0;
        while(k<n){
            if(B.charAt(k) == B.charAt(len)){
                len++;
                lps[k]=len;
                k++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[k]=0;
                    k++;
                }
            }

        }

        while(sb.length()>=n){    
            int bcnt=0;
            int start=0;

            for(int i=0; i<sb.length();i++){
                char c = sb.charAt(i);
                
                if(B.charAt(bcnt) == c){
                    bcnt++;

                    if(bcnt==n){
                        start=i-n+1;
                        break;
                    }
                }else{
                    if(bcnt!=0){
                        bcnt=lps[bcnt-1];
                        i--;
                    }
                }
            }

            if(bcnt!=n) {
                
                break;
            }          
                
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
