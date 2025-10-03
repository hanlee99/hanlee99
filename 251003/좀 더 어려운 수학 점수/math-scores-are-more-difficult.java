import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aMath=sc.nextInt();
        int aEng = sc.nextInt();
        int bMath=sc.nextInt();
        int bEng=sc.nextInt();
        String res="";
        if(aMath > bMath){
            res="A";
        }else if(aMath==bMath){
            res = aEng>bEng ? "A" : "B";
        }else{
            res="B";
        }
        System.out.println(res);
    }
}