
import java.util.LinkedList;

class My {
    public void delNode(LinkedList n1, int k){
        if(n1.isEmpty()){
            return;
        }
        
        for(int i =0;i<n1.size();i++){
            if(i==k-1){
                n1.remove(i);
                System.out.println(n1);
            }
        }
        System.out.println("Index not found");
        
        
    }
    
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(7);
       l1.add(5);
       l1.add(9);
       l1.add(4);
       l1.add(6);
       
       
       
       LinkedList l2 = new LinkedList();
       l2.add(8);
       l2.add(4);
       
       new My().delNode(l1,6);
   }
}