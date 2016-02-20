
import java.util.HashSet;
import java.util.LinkedList;
import static sun.net.www.http.HttpClient.New;

public class My {
    Node head;
    static class Node{
        int x;
        int y;
        Node next;
        Node(int d,int e){
            x = d;
            y = e;
            next = null;
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
   
   void DeleteMidPoints(Node a){
       if(a==null && a.next==null && a.next.next==null){
           return;
       }
       Node temp =a;
       while(a.next.next!=null){
           if(((a.x==a.next.x)&&(a.next.x==a.next.next.x))||(a.y==a.next.y&&a.next.y==a.next.next.y)){
               a.next = a.next.next;
           }
           else{
               a = a.next;
           }
       }
       print(temp);
   }
          
   
    void print(Node a){
        Node temp = a;
        while(temp!=null){
            System.out.println(temp.x+" "+temp.y);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        My m1 = new My();
        My m2= new My();
        m1.head = new Node(2,3);
        Node s2 = new Node(4,3);
        Node s3 = new Node(6,3);
        Node s4 = new Node(10,3);
        Node s5 = new Node(12,3);
//        Node s6 = new Node(20,5);
//        Node s7 = new Node(40,5);
        
       
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
//        s5.next = s6;
//        s6.next = s7;
        
        
//        m2.head = new Node(11);
//        Node s11 = new Node(12);
//        Node s12 = new Node(13);
//        Node s13 = new Node(14);
//        Node s14 = new Node(15);
//        
//        m2.head.next = s11;
//        s11.next = s12;
//        s12.next = s13;
//        s13.next = s14;
        
        
        
      //m1.print(m1.head);
       m1.DeleteMidPoints(m1.head);
     
       
        
    }
}