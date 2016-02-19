
import java.util.LinkedList;

class My {
    public void Segregate(LinkedList n1){
        int j =0;
        for(int i =0;i<n1.size();i++){
            if((int)n1.get(i)%2==0){
                int h = (int)n1.get(i);
                n1.remove(i);
                n1.add(j,h);
                j++;
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
      
       new My().Segregate(l1);
   }
}