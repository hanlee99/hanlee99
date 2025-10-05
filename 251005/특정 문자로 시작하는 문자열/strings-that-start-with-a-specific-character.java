import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int res=0;  int sum=0;
        String[] words = new String[N];
        for(int i=0; i<N; i++){
            words[i]=sc.next();
        }
        char c=sc.next().charAt(0);
        for(String word : words){
            if(c == word.charAt(0)){
                res++;
                sum+=word.length();
            }
        }

        System.out.printf("%d %.2f", res, (double)sum/res);
        
    }
}