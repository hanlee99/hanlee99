import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);
        int max=0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]+nums[nums.length-1-i]);
        }
        System.out.println(max);
        
    }
}