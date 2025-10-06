import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=-1;
        char[] A=sc.next().toCharArray();
        char[] B=sc.next().toCharArray();

        for(int i=A.length-1; i>=0; i--){
            boolean same=true;
            for(int j=0; j<B.length; j++){
                if(B[j] != A[(i+j)%A.length]){
                    same=false;
                    break;
                }
            }
            if(same) {
                cnt=A.length-i;
                break;
            }
        }
        
        System.out.println(cnt);
    }
}