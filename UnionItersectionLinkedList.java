
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
   
   void UnionIntersection(Node a,Node b){
       Node t1 = a;
       Node t2 = b;
       Node t3 = null;
       Node t4 = null;
       Node t5 =null;
       Node t6 = null;
       
       if(t1==null && t2==null){
           return;
       }
       
       if(t1==null^t2==null){
           t5 = null;
           if(t1!=null){
               t6 = t1;
           }
           else{
               t6 = t2;
           }
       }
       HashSet hs = new HashSet();
       
       
       while(t1!=null){
           if(!hs.contains(t1.data)){
               hs.add(t1.data);
           }
           t1 = t1.next;
       }
       
       while(t2!=null){
           if(hs.contains(t2.data)){
           if(t4==null){
               t4 = t2;
               t5 = t4;
           }
           else{
               t4.next = t2;
               t4 = t2;
           }
           }
           t2 = t2.next;
       }
       
       t4.next = null;
       
       t1 = a;
       t2 = b;
        hs.clear();
       
       while(t1!=null){
           if(!hs.contains(t1.data)){
               hs.add(t1.data);
               if(t3==null){
                   t3= t1;
                   t6= t3;
               }
               else{
                   t3.next = t1;
                   t3= t1;
                   
               }
               t1 = t1.next;
               
           }
       }
       
         while(t2!=null){
           if(!hs.contains(t2.data)){
               hs.add(t2.data);
                t3.next = t2;
                   t3= t2;
               
               
           }
           t2 = t2.next;
       }
         t3.next = null;
       
       System.out.println("Intersection");
      print(t5);
      
       System.out.println();
       System.out.println("Union");
       print(t6);
       
       
               
      
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
        Node s2 = new Node(15);
        Node s3 = new Node(4);
        Node s4 = new Node(20);
        
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        
        m2.head = new Node(8);
        Node s6 = new Node(4);
        Node s7 = new Node(2);
        Node s8 = new Node(10);
       
        
        m2.head.next = s6;
        s6.next = s7;
        s7.next = s8;
        
       
        
       //m1.print(m1.head);
       m1.UnionIntersection(m1.head,m2.head);
     
       
        
    }
}