
import java.util.LinkedList;

class My {
   void Sort012(LinkedList n1){
       if(n1.isEmpty()){
           return;
       }
       int c1 = 0;
       int c2 = 0;
       int c3 = 0;
       
       for(int i =0;i<n1.size();i++){
           if((int)n1.get(i)==0){
               c1++;
           }
           if((int)n1.get(i)==1){
               c2++;
           }
           if((int)n1.get(i)==2){
               c3++;
           }  
       }
       n1.clear();
       while(c3>0){
           n1.add(0,2);
           c3--;
       }
       while(c2>0){
           n1.add(0,1);
           c2--;
       }
       while(c1>0){
           n1.add(0,0);
           c1--;
       }
       System.out.println(n1);
   }
    
   public static void main(String[] args){
       LinkedList l1 = new LinkedList();
       l1.add(2);
       l1.add(1);
       l1.add(2);
       l1.add(1);
       l1.add(1);
       l1.add(2);
       l1.add(0);
       l1.add(1);
       l1.add(0);
       
       
       LinkedList l2 = new LinkedList();
       l2.add(8);
       l2.add(4);
       
       new My().Sort012(l1);
   }
}