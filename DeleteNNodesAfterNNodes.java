
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
   
   void DeleteMN(Node a,int m, int n){
       if(a==null){
           return;
       }
       Node temp = a;
       int k = m;
       int l = n;
       while(temp!=null){
           if(k>1){
               temp = temp.next;
               k--;
               continue;
               
           }
           else if(l>0){
               if(temp.next!=null){
                   temp.next = temp.next.next;
               }
               else{
                   temp.next = null;
               }
               l--;
               continue;
           }
           temp = temp.next;
           k=m;
           l=n;
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
        m1.head = new Node(1);
        Node s2 = new Node(2);
        Node s3 = new Node(3);
        Node s4 = new Node(4);
        Node s5 = new Node(5);
        Node s6 = new Node(6);
        Node s7 = new Node(7);
        Node s8 = new Node(8);
        Node s9 = new Node(9);
        Node s10 = new Node(10);
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s7;
        s7.next = s8;
        s8.next = s9;
        s9.next = s10;
        
      //m1.print(m1.head);
       m1.DeleteMN(m1.head,0,0);
     
       
        
    }
}