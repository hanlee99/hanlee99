import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static int k;
    static int n;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.
        dfs(0);
    }
    private static void dfs(int depth){
        if(depth == n){
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
                if(i!=list.size()-1) System.out.print(" ");
            }
            System.out.println();
            return;
        }
        
        for(int i=1; i<=k; i++){
            if(list.size()>=2 && list.get(list.size()-1) == i 
                            && list.get(list.size()-2) == i) continue;
            list.add(i);
            dfs(depth+1);
            list.remove(list.size()-1);
        }
    }
}