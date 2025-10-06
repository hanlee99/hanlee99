import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A=sc.next();
        String q=sc.next();
        int l=A.length()*q.length();    int r=l+A.length()-1;
        for(char c : q.toCharArray()){
            if(c=='L'){
                l++;
            }else{
                l--;
            }
            
        }
        int n=l%A.length();
        System.out.println(A.substring(n, A.length()) + A.substring(0, n));
    }
}