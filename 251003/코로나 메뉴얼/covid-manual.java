import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String res="";
        int count=0;
        while(sc.hasNext()){
            String a=sc.next();
            int b=sc.nextInt();
            String con = "";
            if(a.equals("Y")){
                con= b>=37 ? "A" : "C";
            }else{
                con= b>=37 ? "B" : "D";
            }
            if(con.equals("A")){
                count++;
            }
        }
        res = (count>=2) ? "E" : "N";
        System.out.println(res);    
    }
}