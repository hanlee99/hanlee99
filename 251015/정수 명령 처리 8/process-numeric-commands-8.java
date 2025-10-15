import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            // Please write your code here.
            int e=0;
            if(command.equals("push_front")){
                int A=sc.nextInt();
                list.push_front(A);
            }else if(command.equals("push_back")){
                int A=sc.nextInt();
                list.push_back(A);
            }else if(command.equals("pop_front")){
                System.out.println(list.pop_front());
            }else if(command.equals("pop_back")){
                System.out.println(list.pop_back());
            }else if(command.equals("size")){
                System.out.println(list.size());
            }else if(command.equals("empty")){
                int res = list.isEmpty() ? 1 : 0;
                System.out.println(res);
            }else if(command.equals("front")){
                System.out.println(list.front());
            }else{//back
                System.out.println(list.back());
            }
        }
    }
}

class MyLinkedList{
    Node head;
    Node tail;
    int len=0;
    public MyLinkedList(){
        head=null;
        tail=null;
    }
    public void push_front(int data){
        Node node = new Node(data);
        if(isEmpty()) {
            head=node;
            tail=node;
        }else{
            node.next = head;
            head.prev = node;
            head=node;
        }
        len++;
    }
    public void push_back(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head=node;
            tail=node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;    
        }
        len++;
    }
    public int pop_front(){
        if(isEmpty()) throw new IllegalStateException("삭제 오류");
        int data=head.data;
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }

        len--;
        return data;
    }
    public int pop_back(){
        if(isEmpty()) throw new IllegalStateException("삭제 오류: pop_back");
        int data=tail.data;
        if(head==tail){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
        len--;
        return data;
    }
    public int size(){
        return len;
    }
    public boolean isEmpty(){
        return len==0;
    }
    public int front(){ 
        if(isEmpty()) throw new IllegalStateException("peek 오류");

        return head.data;
    }
    public int back(){
        if(isEmpty()) throw new IllegalStateException("peek 오류");

        return tail.data;
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}