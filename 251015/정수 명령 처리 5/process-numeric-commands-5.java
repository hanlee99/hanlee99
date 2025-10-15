import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String cmd = sc.next();
            int e=0;
            if(cmd.equals("push_back")){
                e=sc.nextInt();
                list.add(e);
            }else if(cmd.equals("pop_back")){
                list.remove(list.size()-1);
            }else if(cmd.equals("size")){
               System.out.println(list.size());
            }else{//get
                e=sc.nextInt();
                System.out.println(list.get(e-1));
            }
        }
    }
}