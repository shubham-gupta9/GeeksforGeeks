
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
    
    
   Node Reverse(Node a){
       if(a==null){
           return null;
       }
       Node current = a;
       Node next = null;
       Node prev = null;
       while(current!=null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
      return prev; 
   }
   
   void DeleteGreatNodes(Node a){
       Node g = Reverse(a);
       Node f= g;
       if(f==null||f.next==null){
           return;
       }
       Node h= null;
       
      
        h = g.next;
       
       while(h!=null){
           if(f.data>h.data){
               f.next = h.next;
               h= h.next;
           }
           else{
               f = f.next;
               h = h.next;
           }
       }
       Node j = Reverse(g);
       print(j);
       
       
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
        m1.head = new Node(12);
        Node s2 = new Node(15);
        Node s3 = new Node(10);
        Node s4 = new Node(11);
        Node s5 = new Node(5);
        Node s6 = new Node(6);
        Node s7 = new Node(2);
        Node s8 = new Node(3);
        
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s7;
        s7.next = s8;
        
       
       m1.DeleteGreatNodes(m1.head);
     
       
        
    }
}