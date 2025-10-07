import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        String res="-1";
        if(isDate(y,m,d)){
            res=whenseason(m);
        }
        System.out.println(res);
    }
    private static boolean isDate(int y,int m, int d){
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0){
            if(y%100==0){
                month[1] = y%400==0 ? 29 : 28; 
            }else{
                month[1]=29;
            }
        }
        return month[m-1]>=d ? true : false;
        
    }
    private static String whenseason(int m){
        if(m>=3&&m<=5) return "Spring";
        else if(m>=6&&m<=8) return "Summer";
        else if(m>=9&&m<=11) return "Fall";
        else return "Winter";
    }
}