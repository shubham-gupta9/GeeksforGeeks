
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
   
   void DetectLoop(Node a){
       Node slow = a;
       Node fast = a;
       Node prev = null;
      
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow ==fast){
               prev = fast;
               break;
           }
       }
       
       if(slow == fast){
           slow = a;
           while(slow!= fast){
               slow = slow.next;
               prev = fast;
               fast = fast.next;
           
           }
           prev.next = null;
           print(a);
       }else{
           System.out.println(" No Loop");
       }
       
       
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
       
        
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        
        
        
        
       //m1.print(m1.head);
       m1.DetectLoop(m1.head);
     
       
        
    }
}