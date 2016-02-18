
import java.util.LinkedList;

class My {
    
    public void delAlternate(LinkedList n1){
       if(n1.isEmpty()){
           return;
       }
       int n = n1.size();
       for(int i =0;i<n-1;i++){
           n1.remove(i+1);
           n--;
           
       }
       System.out.println(n1);
       
       
       
    }
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(1);
       l1.add(3);
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(9);
       l1.add(10);
       l1.add(13);
       l1.add(15);
       l1.add(19);
       l1.add(21);
       
       
//       LinkedList l2 = new LinkedList();
//       l2.add(5);
//       l2.add(6);
//       l2.add(8);
//       l2.add(9);
//       l2.add(11);
//       l2.add(15);
//       l2.add(17);
      
       new My().delAlternate(l1);
       
       
       

       
   }
}