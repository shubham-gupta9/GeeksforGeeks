
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
    
    
    
    Boolean identical(Node a,Node b){
        if(a==null && b == null){
            return true;
        }
        
        while(a!=null && b!=null){
            if(a.data ==b.data){
                a = a.next;
                b = b.next;
            }
            else{
                return false;
            }
        }
      if(a==null && b==null){
          return true;
      } 
      else{
          return false;
      }
        
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
        Node s2 = new Node(11);
        Node s3 = new Node(12);
        
        m1.head.next = s2;
        s2.next = s3;
      
        
        
        m2.head = new Node(10);
        Node s7 = new Node(11);
        Node s8 = new Node(12);
       
        m2.head.next = s7;
        s7.next = s8;
        
     
       Boolean g = m1.identical(m1.head,m2.head);
     System.out.println(g);
       
        
    }
}