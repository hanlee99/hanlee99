import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int answer=-1;
        boolean flag=false;
        char[] A=sc.next().toCharArray();
        char[] B=sc.next().toCharArray();

        for(int i=1; i<A.length; i++){
            cnt++;
            int j=0;
            for(char c : B){
                if(c != A[(i+j)%A.length]){
                    j=0;
                    break;
                }
                j++;
            }
            if(j==A.length) {
                answer=cnt;
                break;
            }
        }
        
        System.out.println(answer);
    }
}