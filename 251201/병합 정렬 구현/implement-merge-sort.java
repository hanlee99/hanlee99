import java.util.Scanner;

public class Main {
    public static int[] temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        temp = new int[arr.length];
        merge_sort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }

    private static void merge_sort(int[] arr, int low, int high){
        int mid = (high-low)/2+low;
        if(low<high) {
            merge_sort(arr, low, mid);
            merge_sort(arr,mid+1, high);
            merge(arr,low, mid, high);
        }
        
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;    i++;
            }else{
                temp[k]=arr[j];
                k++;    j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(int n=0; n<k; n++) 
            arr[low+n] = temp[n];
    }

}
