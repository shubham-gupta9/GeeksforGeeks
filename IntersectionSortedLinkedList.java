
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
    
    
    
    void intersection(Node a,Node b){
        if(a==null || b == null){
            return;
        }
        Node temp = null;
        Node n = null;
        while(a!=null && b!=null){
           
        if(a.data==b.data){
            
            if(temp == null){
                 
                temp = a;
                n = temp;
              
            }
            else{
                
                temp.next = a;
                temp =a ;
                
               
            }
            a = a.next;
            b = b.next;
            
        }
        else if(a.data<b.data){
            a = a.next;
            
        }else if(a.data>b.data){
            b = b.next;
        }
       
    }
    temp.next = null;
        
    print(n);     
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
        Node s2 = new Node(4);
        Node s3 = new Node(6);
        Node s4 = new Node(8);
        Node s5 = new Node(10);
        Node s6 = new Node(13);
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        
        m2.head = new Node(10);
        Node s7 = new Node(11);
        Node s8 = new Node(12);
       
        m2.head.next = s7;
        s7.next = s8;
        
     
       m1.intersection(m1.head,m2.head);
      // m1.print(m1.head);
       
        
    }
}