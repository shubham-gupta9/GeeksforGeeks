
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
   
   void SumList2(Node a, Node b){
       Node c = Reverse(a);
       Node d = Reverse(b);
       Node t3 = null;
       
       if(c==null^d==null){
           if(c==null){
               t3 = d;
           }
           else{
               t3 = c;
           }
       }
       int num = 0;
       int carry = 0;
       while(c!=null && d!=null){
         num = carry+c.data+d.data;
         carry = num/10;
         num = num%10;
         Node my = new Node(num);
         if(t3==null){
             t3 = my;
             
         }
         else{
             my.next = t3;
             t3 = my;
         }
         c = c.next;
         d = d.next;
       }
       
       while(c!=null){
         num = carry+c.data;
         carry = num/10;
         num = num%10;
         Node my = new Node(num);
         
             my.next = t3;
             t3 = my;
        c = c.next;
       }
       
       while(d!=null){
         num = carry+d.data;
         carry = num/10;
         num = num%10;
         Node my = new Node(num);
         
            my.next = t3;
             t3 = my;
        d = d.next;
       }
       
       if(carry!=0){
            Node my = new Node(carry);
            my.next = t3;
             t3 = my;
       }
       print(t3);
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
        m1.head = new Node(5);
        Node s2 = new Node(6);
        Node s3 = new Node(3);
      
        
       
        m1.head.next = s2;
        s2.next = s3;
        
        
        m2.head = new Node(8);
        Node s6 = new Node(4);
        Node s7 = new Node(2);
        
       
        
        m2.head.next = s6;
        s6.next = s7;
        
        
       
        
       //m1.print(m1.head);
       m1.SumList2(m1.head,m2.head);
     
       
        
    }
}