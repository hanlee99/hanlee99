import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        User user1 = new User("codetree", 10);
        User user2 = new User(id, level);
        System.out.println(user1.toString() + "\n" + user2.toString());
    }
}
class User{
    String id;
    int level;
    public User(String id, int level){
        this.id = id;
        this.level = level;
    }
    @Override
    public String toString(){
        return "user " + id + " lv " + level;
    }
}