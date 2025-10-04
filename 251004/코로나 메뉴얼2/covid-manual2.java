import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        String res="";
        int cnt=0;
        while(sc.hasNext()){
            String a=sc.next();
            int b=sc.nextInt();
            if(a.equals("Y")){
                if(b>=37){
                    cnt++;
                    arr[0]++;
                }else{
                    arr[2]++;
                }
            }else{
                if(b>=37){
                    arr[1]++;
                }else{
                    arr[3]++;
                }
            }
        }
        if(cnt>=2) res="E";
        for(int i=0; i<4; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(res);
    }
}