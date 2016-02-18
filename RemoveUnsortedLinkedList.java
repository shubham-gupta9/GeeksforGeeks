
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
    
    
    
    void removedupunsorted(Node a){
        if(a== null){
            return;
        }
        else{
            Node temp = a;
            Node prev = null;
            Node g = null;
            HashSet hs = new HashSet();
            while(temp!=null){
                if(hs.contains(temp.data)){
                        temp = temp.next;
                }
                else{
                    hs.add(temp.data);
                    Node my = new Node(temp.data);
                    if(prev == null){
                        prev = my;
                        g = prev;
                       
                        
                    }
                    else{
                        prev.next = my;
                        prev = my;
                        
                    }
                    temp = temp.next;
                }
            }
            print(g);
            
            
            
            
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
        m1.head = new Node(1);
        Node s2 = new Node(4);
        Node s3 = new Node(4);
        Node s4 = new Node(2);
        Node s5 = new Node(2);
        Node s6 = new Node(2);
        
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
     
       m1.removedupunsorted(m1.head);
       //m1.print(m1.head);
        
        
    }
}