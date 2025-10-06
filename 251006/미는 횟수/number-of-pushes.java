import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        char[] A=sc.next().toCharArray();
        char[] B=sc.next().toCharArray();

        for(int i=0; i<A.length; i++){
            int comp=0;
            if(A[i] == B[0]){
                int j=i;
                for(char c : B){
                    if(c != A[j%A.length]) break;
                    j++;
                    comp++;
                }
            }
            if(comp == A.length) break;
            cnt++;
        }
        if(cnt==A.length) cnt=-1;

        System.out.println(cnt);
    }
}