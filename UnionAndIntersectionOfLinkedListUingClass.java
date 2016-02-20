
import java.util.LinkedList;

class My {
    public void unionIntersection(LinkedList n1, LinkedList n2){
        LinkedList n3 = new LinkedList();
        LinkedList n4 = new LinkedList();
        
        for(int i =0;i<n1.size();i++){
            if(!n3.contains((int)n1.get(i))){
                n3.add((int)n1.get(i));
            }
        }
        
        for(int i =0;i<n2.size();i++){
            if(!n3.contains((int)n2.get(i))){
                n3.add((int)n2.get(i));
            }
        }
        
        for(int i =0;i<n2.size();i++){
            if(n1.contains((int)n2.get(i))){
                n4.add((int)n2.get(i));
            }
        }
        System.out.println(n3);
        System.out.println();
        System.out.println(n4);
        
        
        
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
       
       new My().unionIntersection(l1,l2);
   }
}