import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int Q=sc.nextInt();
        int cnt=0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            arr[i]=a;
        }
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();       

            if(a==1){
                System.out.println(arr[b-1]);
            }else if(a==2){
                int res=0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i] == b){
                        res=i+1;
                        break;
                    }
                }
                System.out.println(res);
            }else{
                int c=sc.nextInt();
                for(int i=b-1; i<c; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }
}