import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack stack = new Stack();
        for(int i = 0; i < n; i++){
            String cmd = sc.next();
            
            if(cmd.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            } else if(cmd.equals("pop")){
                stack.pop();
            } else if(cmd.equals("size")){
                stack.size();
            } else if(cmd.equals("empty")){
                stack.empty();
            } else if(cmd.equals("top")){
                stack.top();
            }
        }
    }
}

class Stack {
    ArrayList<Integer> list = new ArrayList<>(); 
    
    public void push(int a){
        list.add(a);
    }
    
    public void pop(){
        if(list.size() > 0){
            System.out.println(list.get(list.size()-1));
            list.remove(list.size()-1);
        }   
    }
    
    public void size(){
        System.out.println(list.size());
    }
    
    public void empty(){
        int answer = list.size() == 0 ? 1 : 0;  // 수정됨
        System.out.println(answer);
    }
    
    public void top(){
        if(list.size() > 0){  // 예외처리 추가
            System.out.println(list.get(list.size()-1));
        }
    }
}