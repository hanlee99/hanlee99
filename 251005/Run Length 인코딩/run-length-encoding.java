import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int res=0;
        StringBuilder sb=new StringBuilder();
        String word = sc.next();

        int cnt=1;
        char before=word.charAt(0);

        for(int i=1; i<word.length(); i++){
            char c = word.charAt(i);
            if(c == before){
                cnt++;
            }else{
                sb.append(before);
                sb.append(cnt);
                before=c;
                cnt=1;
            }
        }
        sb.append(before+""+cnt);
        System.out.println( sb.length()+ "\n" +sb.toString() );
        
    }
}