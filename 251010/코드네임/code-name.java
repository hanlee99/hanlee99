import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] agents = new Agent[5];
        for(int i=0; i<5; i++){
            agents[i] = new Agent(sc.next(), sc.nextInt());
        }
        int min=101;
        int idx=0;
        for(int i=0; i<5; i++){
            if(min>agents[i].score) {
                min = agents[i].score;
                idx=i;
            }
        }
        System.out.println(agents[idx].codeName + " " + agents[idx].score);
    }
}

class Agent{
    String codeName;
    int score;
    public Agent(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
    public Agent(){
        this.codeName = codeName;
        this.score = score;
    }

}