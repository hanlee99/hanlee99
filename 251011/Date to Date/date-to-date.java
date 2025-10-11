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
        int sumDay1=0;
        int sumDay2=0;
        for(int i=1; i<=m1; i++){
            int day = (i!=m1) ? month[i] : d1-1;
            sumDay1+=day;
        }
        for(int i=1; i<=m2; i++){
            int day = (i!=m2) ? month[i] : d2;
            sumDay2+=day;
        }
        System.out.println((sumDay2-sumDay1));
    }
}