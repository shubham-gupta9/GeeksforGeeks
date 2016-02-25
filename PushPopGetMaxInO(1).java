import java.net.*;
import java.io.*;
 
public class Stack {
    Node head;
    Node head2;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    
    void push(Node top,int a)
    {
        
        Node my = new Node(a);
        if(head2==null){
            head2=my;
        }
        else if(head2!=null && my.data>head2.data){
            pop(head2);
            head2= my;
        }
        if(top==null){
            top =my;
        }
        else{
            my.next = top;
            top = my;
            
        }
        head= top;
    }
    
    int pop(Node a){
        if(a!=null){
            return head2.data;
        }
        return -1;
    }
    
    void print(Node a){
        
        if(a==null){
            return;
        }
        Node temp =a;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) throws IOException {
       Stack s = new Stack();
       s.push(s.head,1);
       
       s.push(s.head,3);
      
       s.push(s.head,4);
      
       s.push(s.head,5);
       //s.print(s.head);
       
    }
}