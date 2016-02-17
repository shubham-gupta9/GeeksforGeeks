
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
    
    public void Reverse(){
      Node prev = null;
      Node current = head;
      Node next = null;
      
      while(current!=null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      
      head = prev;
      
        
    }
    
     void Merge(Node a, Node b){
         Node temp = null;
         Node t2 = a;
      while(a!=null && b!=null){
          
          if(a.data<b.data){
              if(temp==null){
                  temp = a;
                  
              }
              else{
                 temp.next = a;
                 temp = a;
              }
              a = a.next;
              
              
          }
          else{
               if(temp==null){
                  temp = b;   
              }
              else{
                 temp.next = b;
                 temp = b;
              }
              b= b.next;
          }
            
      }
      
      if(a!=null){
          temp.next = a;
      }
      
      if(b!=null){
          temp.next = b;
      }
      
      temp = t2;
      print(temp); 
      
      
      
     
      
      
    }
    
    void reverse(Node a){
       if(a==null){
           return;
       }
       
       Node first = a;
       Node rest = a.next;
       
       if(rest==null){
           return;
       }
       reverse(rest);
       first.next.next = first;
       
       first.next = null;
       a = rest;
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
        
         m2.head = new Node(2);
        Node s7 = new Node(4);
        Node s8 = new Node(6);
        Node s9 = new Node(8);
       
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        
        m2.head.next = s7;
        s7.next = s8;
        s8.next = s9;
    
        //m1.Merge(m1.head,m2.head);
        m1.reverse(m1.head);
        
        
    }
}