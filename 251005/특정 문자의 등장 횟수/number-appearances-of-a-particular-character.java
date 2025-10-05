import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        
        int res1=0;     int res2=0;
        
        for(int i=0; i<word.length()-1; i++){
            String st=word.charAt(i) +""+ word.charAt(i+1);
            if(st.equals("ee")){
                res1++;
            }
            if(st.equals("eb")){
                res2++;
            }
        }

        System.out.println(res1+" "+res2);
        

        
        
    }
}