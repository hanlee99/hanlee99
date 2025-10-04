import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0)    break;
            list.add(a);
        }
        for(int a : list){
            a = a%2==0 ? a/2 : a+3;
            System.out.print(a+" ");
        }


    }
}