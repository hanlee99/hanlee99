import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int sumDay1 = d1;
        int sumDay2= d2;
        for(int i=1; i<m1; i++){
            sumDay1+=month[i];
        }
        for(int i=1; i<m2; i++){
            sumDay2+=month[i];
        }
        int diff = Math.abs(sumDay2-sumDay1+1);
        String res = day[diff%7];
        System.out.println(res);
    }
}