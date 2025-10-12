import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String targetDay = sc.next();
        // Please write your code here.
        int[] month={0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int targetDiff=0;
        for(int i=0; i<7; i++) {
            String d=day[i];
            if(d.equals(targetDay)){
                targetDiff=i;
                break;
            }
        }

        int sumDay1 = d1;
        int sumDay2 = d2;
        for(int i=1; i<m1; i++) sumDay1+=month[i];
        
        for(int i=1; i<m2; i++) sumDay2+=month[i];
        
        int diff=sumDay2-sumDay1;
        int sum = (diff%7<targetDiff) ? diff/7 : diff/7+1;
        System.out.println(sum);
    }
}