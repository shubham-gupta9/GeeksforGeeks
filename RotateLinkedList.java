
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
   
   void Rotate(Node a,int k){
      int n = k;
      Node t = a;
      Node prev = null;
      if(t==null){
          return;
      }
      while(t!=null && n>0){
          prev = t;
          t = t.next;
          n--;
      }
      
      if(t==null){
          return;
      }
      
      prev.next = null;
      prev = t;
      while(t.next!=null){
          t = t.next;
      }
      
      t.next = a;
      a = prev;
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
        m1.head = new Node(10);
        Node s2 = new Node(20);
        Node s3 = new Node(30);
        Node s4 = new Node(40);
        Node s5 = new Node(50);
        Node s6 = new Node(60);
        Node s7 = new Node(70);
        Node s8 = new Node(80);
        Node s9 = new Node(90);
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s7;
        s7.next = s8;
        s8.next = s9;
       
       m1.Rotate(m1.head,4);
     
       
        
    }
}