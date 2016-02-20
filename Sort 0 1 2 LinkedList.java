
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
   
   void Sort012(Node a){
       if(a==null){
           return;
       }
       int x = 0;
       int y = 0;
       int z = 0;
       
       while(a!=null){
           if(a.data==0){
               x++;
           }
           else if(a.data==1){
               y++;
           }
           else{
               z++;
           }
           
           a = a.next;
       }
       Node my = null;
       while(z>0){
          my = new Node(2);
          my.next =a;
          a = my;
          z--;
       }
       
       while(y>0){
          my = new Node(1);
          my.next =a;
          a = my;
          y--;
       }
       
       while(x>0){
          my = new Node(0);
          my.next =a;
          a = my;
          x--;
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
        m1.head = new Node(2);
        Node s2 = new Node(1);
        Node s3 = new Node(2);
        Node s4 = new Node(1);
        Node s5 = new Node(1);
        Node s6 = new Node(2);
        Node s7 = new Node(0);
        Node s8 = new Node(1);
        Node s9 = new Node(0);
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s7;
        s7.next = s8;
        s8.next = s9;
        
        
        
        
        
       
        
        
        
        
        
       
        
       //m1.print(m1.head);
       m1.Sort012(m1.head);
     
       
        
    }
}