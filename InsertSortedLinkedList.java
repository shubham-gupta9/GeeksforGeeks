
import java.util.LinkedList;

public class My {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void push(int val){
        Node m = new Node(val);
        if(head==null){
            head= m;
        }
        else{
           m.next = head;
           head = m;
        }
    }
    
    void insertSorted(Node a,int val){
        Node temp = a;
        Node prev = null;
        Node my = new Node(val);
        if(temp == null){
            temp = my;
        }
        else{
            while(temp.data<val){
                prev = temp;
                temp = temp.next;
            }
            my.next = prev.next;
            prev.next = my;
            
        }
        print(a);
    }
      
     
     
    void print(Node a){
        Node temp = a;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        My m1 = new My();
        My m2= new My();
        m1.head = new Node(1);
        Node s2 = new Node(3);
        Node s3 = new Node(5);
        Node s4 = new Node(7);
        Node s5 = new Node(9);
        Node s6 = new Node(11);
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        
       m1.insertSorted(m1.head, 6);
        
        
        
    }
}