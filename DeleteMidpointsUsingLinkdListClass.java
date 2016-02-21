
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Type{
    int x ;
    int y;
    Type(int a, int b){
        x = a;
        y = b;
    }
    static int getx(Type a){
        return a.x;
    }
    
    static int gety(Type a){
        return a.y;
    }
}
class My {
    
      void DeleteMidPoints(LinkedList n1){
          if(n1.isEmpty()|| n1.size()<3){
              System.out.println("Nothing to delete");
              return;
          }
          int i =0;
          while(i<(n1.size()-2)){
             if(((Type.getx((Type)n1.get(i))==Type.getx((Type)n1.get(i+1)))&&(Type.getx((Type)n1.get(i+1))==Type.getx((Type)n1.get(i+2))))||((Type.gety((Type)n1.get(i))==Type.gety((Type)n1.get(i+1)))&&(Type.gety((Type)n1.get(i+1))==Type.gety((Type)n1.get(i+2))))){
                 n1.remove(i+1);   
          }
                 
             
             else{
                 i++;
             }
          }
          
          
          for(int l =0;l<n1.size();l++){
              int x = Type.getx((Type)n1.get(l));
              int y = Type.gety((Type)n1.get(l));
              System.out.println(x+" "+y);
              
          }
//         ListIterator<Type> ls = n1.listIterator();
//         while(ls.hasNext()){
//             System.out.println(ls.next());
//         }
          
          
          
      }
   public static void main(String[] args){
     LinkedList<Type> l1 =  new LinkedList<Type>();
       l1.add(new Type(2,3));
       l1.add(new Type(4,3));
       l1.add(new Type(6,3));
       l1.add(new Type(10,3));
       l1.add(new Type(12,3));

       
//       LinkedList l2 = new LinkedList();
//       l2.add(8);
//       l2.add(4);
//       l2.add(3);
//       l2.add(4);
//       l2.add(5);
//       l2.add(6);
//       l2.add(7);
//       l2.add(8);
//       l2.add(9);
//       l2.add(10);
       
     new My().DeleteMidPoints(l1);
   }
}