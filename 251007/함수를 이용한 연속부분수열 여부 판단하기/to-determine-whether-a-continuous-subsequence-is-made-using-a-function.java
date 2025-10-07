import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        
        if(isSubsequence(a,b)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean isSubsequence(int[] a, int[] b){
        int[] lps = new int[b.length];
        int k=1;    int len=0;
        while(k<b.length){
            if(b[k] == b[len]){
                len++;
                lps[k] = len;
                k++;
            }else{
                if(len==0) {
                    lps[k]=0;
                    k++;
                }
                else len=lps[len-1];
            }
        }
        len=0;
        
        for(int i=0; i<a.length; i++){
            while(len>0 && a[i] != b[len]) len=lps[len-1];

            if(a[i] == b[len]) len++;

            if(len == b.length) break;
        }
        return (len==b.length);
    }
}