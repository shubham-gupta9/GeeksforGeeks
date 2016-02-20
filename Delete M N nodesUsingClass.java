
import java.util.LinkedList;

class My {
   void DeleteMN(LinkedList n1,int m,int n){
       if(n1.isEmpty()){
           return;
       }
       int j = n1.size();
       int g = m;
       int h = n;
       int p =0;
       while(p<j){
           if(g>0){
               p++;
               g--;
               continue;
               
           }
           if(h>0){
               n1.remove(p);
               j--;
               h--;
               continue;
           }
          g =m;
          h = n;
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
       l1.add(8);
       l1.add(9);
       l1.add(10);
       
       LinkedList l2 = new LinkedList();
       l2.add(8);
       l2.add(4);
       
       new My().DeleteMN(l1,2,2);
   }
}