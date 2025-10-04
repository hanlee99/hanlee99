import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int num=N;
        int cnt=0; 
        while(cnt<2){
            list.add(N);
            if(N%5==0)  cnt++;
            N+=num;
        }
        for(int a : list) System.out.print(a+" ");
    }
}