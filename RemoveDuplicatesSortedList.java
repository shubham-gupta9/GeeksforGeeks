
import java.util.HashSet;
import java.util.LinkedList;
import static sun.net.www.http.HttpClient.New;

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
    
    void removedup(Node a){
        if(a==null){
            return;
        }
        else if(a.next==null){
            return;
        }
        else{
            Node first = a;
            Node second = a.next;
            while(second!=null){
                if(first.data == second.data){
                    second = second.next;
                    first.next = second;
                }
                else{
                    first = first.next;
                    second = second.next;
                }
            }
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
        Node s3 = new Node(3);
        Node s4 = new Node(5);
        Node s5 = new Node(5);
        Node s6 = new Node(8);
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        
        m2.head = new Node(4);
        Node s7 = new Node(6);
        Node s8 = new Node(8);
       
        m2.head.next = s7;
        s7.next = s8;
        s8.next = s3;
     
      // m1.print(m1.head);
       //System.out.println();
       //m2.print(m2.head);
        
       m1.removedup(m1.head);
       //m1.print(m1.head);
        
        
    }
}