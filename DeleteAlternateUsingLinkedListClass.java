
import java.util.LinkedList;

class My {
    
    public void DeleteAdjacent(LinkedList n1){
        if(n1.isEmpty() || n1.size()==1){
            return;
        }
        int d = n1.size();
        for(int i =0;i<d-1;i++){
            if((int)n1.get(i)<(int)n1.get(i+1)){
                n1.remove(i);
                i--;
                d--;
            }
        }
        System.out.println(n1);
    }
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(8);
       l1.add(7);
       l1.add(6);
       l1.add(5);
       l1.add(4);
       l1.add(3);
       l1.add(2);
       l1.add(1);
       
       
       LinkedList l2 = new LinkedList();
       l2.add(1);
       l2.add(3);
       l2.add(5);
       l2.add(6);
       l2.add(7);
       l2.add(9);
       l2.add(10);
      
       new My().DeleteAdjacent(l1);
   }
}