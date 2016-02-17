
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
    
    Node getIntersection(Node a,Node b){
       Node t1 = a;
       Node t2 = b;
       int c1 =0;
       int c2 =0;
       while(t1!=null){
          c1++;
          t1 = t1.next;
       }
       
       while(t2!=null){
           c2++;
           t2 = t2.next;
       }
       
       int diff = Math.abs(c1-c2);
       t1 = a;
       t2 = b;
       if(c1>c2){
           while(diff>0){
               t1 = t1.next;
               diff--;
           }
       }
       else{
           while(diff>0){
               t2 = t2.next;
               diff--;
           }
       }
       
       while(t1!=null && t2!=null){
           if(t1==t2){
               return t1;
           }
           else{
               t1= t1.next;
               t2 = t2.next;
           }
       }
       return null;
       
        
    }
    
    Node reverse(Node a){
        Node prev = null;
        Node current = a;
        Node next = null;
        
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        Node s5 = new Node(8);
        Node s6 = new Node(1);
        
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
        
        Node f= m1.getIntersection(m1.head,m2.head);
       if(f!=null){
           System.out.println(f.data);
       }
       else{
           System.out.println("null");
       }
       //m1.print(m1.head);
        
        
    }
}