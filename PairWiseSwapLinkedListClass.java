
import java.util.LinkedList;

class My {
    
    public void swap(LinkedList n){
       if(n.isEmpty()){
           return;
       }
       for(int i =0;i<n.size();i+=2){
           int d = (int)n.get(i);
           n.remove(i);
           n.add(i+1,d);
       }
       
        System.out.println(n);
    }
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(1);
       l1.add(2);
       l1.add(3);
       l1.add(4);
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(8);
       l1.add(9);
       l1.add(10);
       l1.add(11);
       l1.add(12);
       new My().swap(l1);
       
       
       

       
   }
}