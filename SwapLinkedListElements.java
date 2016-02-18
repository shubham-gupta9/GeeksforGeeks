
import java.util.LinkedList;

class My {
    
    public void swap(LinkedList n,int a, int b){
        if(n.isEmpty()){
            return;
        }
        else{
            int x=0;
            int y=0;
            if(n.contains(a)){
                  x = n.indexOf(a);
                }
            if(n.contains(b)){
                y = n.indexOf(b);
            }
            
            if(x<y){
                n.remove(x);
                n.add(y,a);
                n.remove(y-1);
                n.add(x,b);
            }
            else{
                n.remove(y);
                n.add(x,b);
                n.remove(x-1);
                n.add(y,a);
               
            }
            
            
        }
        System.out.println(n);
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
       l1.add(11);
       l1.add(12);
       new My().swap(l1, 1, 12);
       
       
       

       
   }
}