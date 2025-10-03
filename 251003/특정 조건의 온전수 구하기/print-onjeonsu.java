import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int N=sc.nextInt();
        
        for(int i=1; i<=N; i++){
            String st = i+"";
            char c=st.charAt(st.length()-1);

            if(i%2!=0 && c!='5' && !(i%3==0&&i%9!=0)){
                System.out.print(i + " ");
            }
        }

    }
}