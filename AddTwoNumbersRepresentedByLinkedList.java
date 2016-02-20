
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
   
   void addNum(Node a,Node b){
       Node t1 = a;
       Node t2 = b;
       int carry =0;
       Node t3 =null;
       Node t4 = null;
       if(t1==null){
           t4 = t2;
       }
       if(t2==null){
           t4 = t1;
       }
       int num = 0;
       
       while(t1!=null && t2!=null){
            num = t1.data+t2.data+carry;
            carry = num/10;
            //System.out.println("carry "+carry);
            num = num%10;
            Node m = new Node(num);
            if(t3==null){
                t3 = m;
                t4 = t3;
            }
            else{
                t3.next = m;
                t3 = m;
            }
            t1 = t1.next;
            t2 = t2.next;
       }
       while(t1!=null){
           num = t1.data+carry;
           carry = num/10;
           num = num%10;
           Node m = new Node(num);
           t3.next = m;
           t3 = m;
           t1 = t1.next;
       }
       
       while(t2!=null){
           num = t2.data+carry;
           carry = num/10;
           num = num%10;
           Node m = new Node(num);
           t3.next = m;
           t3 = m;
           t2 = t2.next;
           
       }
       if(carry!=0){
         Node m = new Node(carry);  
         t3.next = m;
           t3 = m;
       }
       print(t4);
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
        m1.head = new Node(7);
        Node s2 = new Node(5);
        Node s3 = new Node(9);
        Node s4 = new Node(4);
        Node s5 = new Node(6);
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        
        m2.head = new Node(8);
        Node s6 = new Node(4);
        
       
        
        m2.head.next = s6;
        
       
        
       //m1.print(m1.head);
       m1.addNum(m1.head,m2.head);
     
       
        
    }
}