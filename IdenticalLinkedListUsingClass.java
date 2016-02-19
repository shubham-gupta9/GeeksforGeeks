
import java.util.LinkedList;

class My {
    
    public Boolean Identical(LinkedList n1,LinkedList n2){
       if(n1.isEmpty() && n2.isEmpty()){
           return true;
       }
       if(n1.size()!=n2.size()){
           return false;
       }
       
       for(int i =0;i<n1.size();i++){
           if((int)n1.get(i)!=(int)n2.get(i)){
              return false; 
           }
       }
       return true;
       
       
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
       
       
       
       LinkedList l2 = new LinkedList();
       l2.add(1);
       l2.add(3);
       l2.add(5);
       l2.add(6);
       l2.add(7);
       l2.add(9);
       l2.add(10);
      
       Boolean g=new My().Identical(l1,l2);  
       System.out.println(g);
   }
}