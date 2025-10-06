import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st=sc.next();
        String st2=sc.next();

        int cnt=0;
        int sum=Integer.parseInt(st)+Integer.parseInt(st2);
        String s =sum+"";
        for(char c : s.toCharArray()){
            if(c=='1') cnt++;
        }
        System.out.println(cnt);
    }
}