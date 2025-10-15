import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        selectionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int min=i;
            for(int j=i; j<n; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[min];
            arr[min]=tem;
        }
    }
}