
import java.util.LinkedList;

class My {
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(1);
       l1.add(1);
       l1.add(1);
       l1.add(1);
       l1.add(2);
       l1.add(2);
       l1.add(2);
       l1.add(3);
       l1.add(3);
       l1.add(5);
       l1.add(5);
       l1.add(5);
       
       
       int d = l1.size();
       for(int i  =0;i<d-1;i++){
           if(l1.get(i)==l1.get(i+1)){
               l1.remove(i+1);
               i--;
               d--;
           }
           
       }
       System.out.println(l1);
//       System.out.println();
//       
//       System.out.println(l1);
   }
}