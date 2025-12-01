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
        quick_sort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int partition(int[] arr,int low, int high){
        int pivot = select_pivot(arr, low, high);
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        
        return i+1;
    }

    private static void quick_sort(int[] arr,int low, int high){
        if(low<high){
            int pos = partition(arr, low, high);
            quick_sort(arr,low, pos-1);
            quick_sort(arr, pos+1, high);
        }
    }

    private static int select_pivot(int[] arr,int low, int high){
        if(high-low+1>3){
            swap(arr, (high-low/2), high);
        }
        return arr[high];
    }
    private static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}