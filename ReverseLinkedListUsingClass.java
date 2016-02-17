
import java.util.LinkedList;

class My extends LinkedList{
   void Reverse(LinkedList a){
       int d = a.size();
       for(int i=0;i<d;i++){
           int f = (int)a.get(i);
           a.remove(i);
           a.add(0,f);
       }
       
   } 
   
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(1);
       l1.add(2);
       l1.add(3);
       l1.add(4);
       l1.add(5);
       
       System.out.println(l1);
       System.out.println();
       new My().Reverse(l1);
       System.out.println(l1);
   }
}