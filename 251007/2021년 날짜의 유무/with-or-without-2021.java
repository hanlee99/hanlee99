import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        String res = isDate(m,d) ? "Yes" : "No";
        System.out.println(res);
    }
    private static boolean isDate(int m, int d){
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(m>12) return false;
        return month[m-1]>=d ? true : false;
        
    }
}