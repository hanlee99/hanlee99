import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int n=arr.length;
        int win=0;
        int x=-1; int y=-1;
        // Please write your code here.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //System.out.println(i+" "+j+" "+win);
                int pin=arr[i][j];

                if(pin == 0) continue;

                if(i+5<n && is_win(arr, i, j, 0)){
                    win = pin;
                    x=i+2;  y=j;
                    break;
                }   
                if(j+5<n && is_win(arr, i, j, 1)){               
                    win = pin;
                    x=i;    y=j+2;
                    break;
                }   
                if(i+5<n && j+5<n && is_win(arr, i, j, 2)){
                    win = pin;
                    x=i+2;  y=j+2;
                    break;
                }          
                if(i-5>=0 && j-5>=0 && is_win(arr, i, j, 3)){
                    win = pin;
                    x=i-2;  y=j-2;
                    break;
                }
            }
            if(win!=0) break;
        }
        
        System.out.println(win);
        if(win!=0){
            System.out.println((x+1)+" "+(y+1));
        }
    }

    private static boolean is_win(int[][] arr, int i, int j, int way){
        int di=0;   int dj=0;
        int pin=arr[i][j];
        if(way == 0){
            di++;
        }else if(way == 1){
            dj++;
        }else if(way == 2){
            di++;
            dj++;
        }else{
            di--;
            dj--;
        }
        
        for(int k=1; k<5; k++){
            if(arr[i+di*k][j+dj*k] != pin) 
                return false;
        }
        //System.out.println("true");
        return true;
    }

}