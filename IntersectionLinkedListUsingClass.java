
import java.util.LinkedList;

class My {
    
    public void intersect(LinkedList n1, LinkedList n2){
       if(n1.isEmpty() || n2.isEmpty()){
           return;
       }
       LinkedList l3 = new LinkedList();
       int i =0;
       int j =0;
       while(i<n1.size() && j<n2.size()){
           if((int)n1.get(i)==(int)n2.get(j)){
               l3.addLast((int)n1.get(i));
               i++;
               j++;
           }
           
           else if((int)n1.get(i)<(int)n2.get(j)){
                   i++;
                   }
           else if((int)n1.get(i)>(int)n2.get(j)){
               j++;
           }
           
       }
       System.out.println(l3);
       
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
       l1.add(25);
       
       LinkedList l2 = new LinkedList();
       l2.add(5);
       l2.add(6);
       l2.add(8);
       l2.add(9);
       l2.add(11);
       l2.add(15);
       l2.add(17);
      
       new My().intersect(l1,l2);
       
       
       

       
   }
}