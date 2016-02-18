
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
    
    void Swap(Node a, int x, int y){
        if(a==null){
            return;
        }
        else{
            Node curx = a;
            Node cury = a;
            Node prevx = null;
            Node prevy = null;
            while(curx!=null){
                if(curx.data==x){
                    break;
                }
                else{
                    prevx = curx;
                    curx = curx.next;
                }
            }
            
            while(cury!=null){
                if(cury.data==y){
                    break;
                }
                else{
                    prevy = cury;
                    cury = cury.next;
                }
            }
            
            if(curx.next==cury){
                curx.next = cury.next;
                cury.next = curx;
                prevx.next = cury;
            }
            else if(cury.next == curx){
                cury.next = curx.next;
                curx.next = cury;
                prevy.next = curx;
            }
            else if(curx.next==null){
                if(cury==a){
                curx.next = cury.next;
                cury.next = null;
                prevx.next = cury;
                a = curx;
                }
                else{
                  curx.next = cury.next;
                  cury.next = null;
                  prevy.next = curx;
                  prevx.next = cury;
                }
            }
            else if(cury.next==null){
                
                if(curx==a){
                    cury.next = curx.next;
                    curx.next = null;
                    prevy.next = curx;
                    a = cury;
                }
                else{
                    cury.next = curx.next;
                    curx.next = null;
                    prevx.next = cury;
                    prevy.next = curx;
                    
                }
            }
            else{
           Node temp = curx.next;
           curx.next = cury.next;
           cury.next = temp;
           prevx.next = cury;
           prevy.next = curx;
           
            }
           print(a); 
            
        }
    }
    
    void removedupunsorted(Node a){
        if(a== null){
            return;
        }
        else{
            Node temp = a;
            Node prev = null;
            HashSet hs = new HashSet();
            while(a!=null){
                if(!hs.contains(a.data)){
                    hs.add(a.data);
                    if(prev == null){
                        prev = temp;
                    }
                    else{
                        prev.next = temp;
                    }
                    temp = temp.next;
                }
                else{
                    prev.next = temp.next;
                    temp = temp.next;
                }
            }
            print(a);
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
        Node s2 = new Node(2);
        Node s3 = new Node(3);
        Node s4 = new Node(4);
        Node s5 = new Node(5);
        Node s6 = new Node(6);
        
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
     
        m1.Swap(m1.head, 6, 4);
       //m1.print(m1.head);
        
        
    }
}