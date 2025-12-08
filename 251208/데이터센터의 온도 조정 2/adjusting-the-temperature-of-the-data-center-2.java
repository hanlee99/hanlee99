import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
            min = Math.min(min, ta[i]);
            max = Math.max(max, tb[i]);
        }
        // Please write your code here.
        int work=0;
        for(int i=0; i<=1000; i++){
            int curWork=0;
            for(int j=0; j<n; j++){
                if(i<ta[j]){
                    curWork+=c;
                }else if(i<=tb[j]){
                    curWork+=g;
                }else{
                    curWork+=h;
                }
            }
            work = Math.max(work, curWork);
        }
        System.out.println(work);
    }
}