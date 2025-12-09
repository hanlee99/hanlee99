import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int n;
    static int m;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        dfs(0, 1);
    }
    private static void dfs(int depth, int curr){
        if(depth == m){
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
                if(list.size()-1!=i) System.out.print(" ");
            }
            System.out.println();
            return;
        }

        for(int i=curr; i<=n; i++){
            list.add(i);
            dfs(depth+1,i+1);
            list.remove(list.size()-1);
        }
    }

}