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
        heap_sort(arr);
        for(int k : arr){
            System.out.print(k+" ");
        }   
        System.out.println();
    }

    private static void heapify(int[] arr, int i){
        while(i>0){
            int parent = (i+1)/2 -1;
            if(arr[i]>arr[parent]){
                swap(arr, i, parent);
            }
            i--;
        }
    }

    private static void heap_sort(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            heapify(arr, i);
            swap(arr, 0, i);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}