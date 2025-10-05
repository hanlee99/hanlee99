import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int cnt=0;
        for(int i=0; i<word.length(); i++){
            if(cnt<1 && word.charAt(i)=='e'){
                cnt++;
            }else{
                System.out.print(word.charAt(i));
            }
        }
    }
}