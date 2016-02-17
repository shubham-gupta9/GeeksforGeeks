
import java.util.LinkedList;

class My extends LinkedList{
   void InsertSorted(LinkedList a,int val){
       if(a.isEmpty()){
           a.add(val);
       }
       else{
           int i =0;
           while((int)a.get(i)<val){
               i++;
           }
           a.add(i,val);
           
       }
      
       
   } 
   
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(1);
       l1.add(2);
       l1.add(3);
       l1.add(5);
       l1.add(6);
       
       System.out.println(l1);
       System.out.println();
       new My().InsertSorted(l1, 4);
       System.out.println(l1);
   }
}