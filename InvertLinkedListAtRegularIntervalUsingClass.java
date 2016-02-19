
import java.util.LinkedList;

class My {
    
    public void invert(LinkedList n1 ,int k){
        if(n1.isEmpty()){
            return;
        }
        int h =0;
        int l = k;
        for(int i =0;i<n1.size();i++){
            int g = (int)n1.get(i);
            n1.remove(i);
            n1.add(h,g);
            l--;
            if(l==0){
                l =k;
                h+=k;
            }
            
        }
        System.out.println(n1);
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
       
       
       
       LinkedList l2 = new LinkedList();
       l2.add(1);
       l2.add(3);
       l2.add(5);
       l2.add(6);
       l2.add(7);
       l2.add(9);
       l2.add(10);
      
       new My().invert(l1, 9);
   }
}