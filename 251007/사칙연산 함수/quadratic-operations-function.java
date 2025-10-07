import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        String res="";
        int val=-1;
        if(o=='+'){
            val = plus(a,c); 
        }else if(o=='-'){
            val = minus(a,c);
        }else if(o=='*'){
            val = mul(a,c);
        }else if(o=='/'){
            val=div(a,c);
        }else{
            res="False";
        }

        if(!res.equals("False")){
            res =a +" "+o+" "+c+" = " + val; 
        } 
        System.out.println(res);
    }
    private static int plus(int a, int c){
        return a+c;
    }
    private static int minus(int a, int c){
        return a-c;
    }
    private static int mul(int a, int c){
        return a*c;
    }
    private static int div(int a, int c){
        return a/c;
    }
}