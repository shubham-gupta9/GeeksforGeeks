
import java.util.LinkedList;

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
    
    boolean checkPalindrome(Node a){
        Node slow = a;
        Node fast  = a;
        int count=0;
        while(slow!=null){
            count++;
            slow = slow.next;
               
        }
        
        slow = a;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node f = null;
        if(count%2==0){
             f = reverse(slow);
        }
        else{
             f = reverse(slow.next);
        }
        slow = a;
        
        while(f!=null){
            if(slow.data != f.data){
                return false;
            }
            f = f.next;
            slow = slow.next;
            
        }
        return true;
        
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
        Node s4 = new Node(5);
        Node s5 = new Node(8);
        Node s6 = new Node(1);
        
        m1.head.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
     
        
       boolean my = m1.checkPalindrome(m1.head);
       System.out.println(my);
       //m1.print(m1.head);
        
        
    }
}