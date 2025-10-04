import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        
        for(int i=1; i<=19; i++){
            for(int j=1; j<=19; j++){
                if(j==19){
                    System.out.println(i+" * "+j+" = "+i*j); 
                }else{
                    System.out.print(i+" * "+j+" = "+i*j+" / ");
                    j+=1;
                    System.out.println(i+" * "+j+" = "+i*j);
                }
            }
        }
    }
}