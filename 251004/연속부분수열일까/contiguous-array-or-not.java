import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int None=sc.nextInt();  int Mone=sc.nextInt();
        int cntA=0; int cntB=0;
        int[] arr1 = new int[None]; int[] arr2 = new int[Mone];
        String res="No";
        for(int i=0; i<None; i++){
            int a=sc.nextInt();
            arr1[i]=a;
        }
        for(int i=0; i<Mone; i++){
            int a=sc.nextInt();
            arr2[i]=a;
        }
        for(int i=0; i<None && cntB<Mone; i++){
            if(arr1[i] == arr2[cntB]){
                cntB++;
            }else{
                cntB=0;
            }
            if(cntB == Mone){
                res="Yes";
                break;
            }
        }
        System.out.println(res);

    }
}