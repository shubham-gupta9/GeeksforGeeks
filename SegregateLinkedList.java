
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
   
   void Segregate(Node a){
       if(a == null ||a.next == null){
           return;
       }
       Node temp = a;
       Node prev = null;
       Node last = null;
       while(temp.next!=null){
           temp = temp.next;
       }
       
       
       last = temp;
       Node end = last;
       Node change = null;
       temp = a;
       while(temp!=null && temp!=end){
           
           if((temp.data%2)==1 ){
               
               if(temp ==a){
                   prev = temp;
                   temp = temp.next;
                   a = a.next;
                   prev.next = null;
                   last.next = prev;
                   last = prev;
               }
               else{
                   prev.next = temp.next;
                   change = temp;
                   temp = temp.next;
                   change.next = null;
                   last.next = change;
                   last = change;
               }
              
               
           }
           else{
               prev = temp;
               temp = temp.next;
               
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
        m1.head = new Node(8);
        Node s2 = new Node(12);
        Node s3 = new Node(10);
        Node s4 = new Node(5);
        Node s5 = new Node(4);
        Node s6 = new Node(1);
        Node s7 = new Node(6);
        
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s7;
        
        
       
       m1.Segregate(m1.head);
     
       
        
    }
}