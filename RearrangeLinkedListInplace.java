
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
   
   void Rearrange(Node a){
       if(a==null){
           return;
       }
       Node last = null;
       Node slow = a;
       Node fast = a;
       while(fast!=null && fast.next!=null){
           last = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       if(fast!=null){
           last = slow;
           slow = slow.next;
       }
       Node prev = null;
       Node next = null;
       Node current = slow;
       while(current!=null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       slow = prev;
       
       fast = a;
       int flag = 0;
       while(fast!=last &&fast.next!=null){
              Node g = slow;
              slow = slow.next;
              g.next = fast.next;
              fast.next = g;
              fast = fast.next.next;  
       }
       fast.next = slow;
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
        Node s2 = new Node(2);
        Node s3 = new Node(3);
        Node s4 = new Node(4);
        Node s5 = new Node(5);
        
//        Node s6 = new Node(20,5);
//        Node s7 = new Node(40,5);
        
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        
//        s6.next = s7;
        
        
//        m2.head = new Node(11);
//        Node s11 = new Node(12);
//        Node s12 = new Node(13);
//        Node s13 = new Node(14);
//        Node s14 = new Node(15);
//        
//        m2.head.next = s11;
//        s11.next = s12;
//        s12.next = s13;
//        s13.next = s14;
        
        
        
      //m1.print(m1.head);
       m1.Rearrange(m1.head);
     
       
        
    }
}