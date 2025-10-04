import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int max=-999; 
        int min=999;
        int res=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a == 999 || a==-999) break;
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(max + " " + min);

    }
}