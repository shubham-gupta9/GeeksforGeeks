
import java.util.LinkedList;

class My {
    public void add(LinkedList n1, LinkedList n2){
        LinkedList n3 = new LinkedList();
        if(n1.isEmpty() && n2.isEmpty()){
            return;
        }
        if(n1.isEmpty()){
            n3 = n2;
        }
        if(n2.isEmpty()){
            n3 = n1;
        }
        
        int a = n1.size();
        int b = n2.size();
        int carry =0;
        int i =0;
        while(a>0 && b>0){
            int num = (int)n1.get(i)+(int)n2.get(i)+carry;
            carry = num/10;
            num = num%10;
            n3.add(num);
            a--;
            b--;
            i++;
        }
        
        while(a>0){
          int num = (int)n1.get(i)+carry; 
          carry = num/10;
            num = num%10;
            n3.add(num);
            a--;
            i++;
        }
        
        while(b>0){
          int num = (int)n2.get(i)+carry; 
          carry = num/10;
            num = num%10;
            n3.add(num);
            b--;
            i++;
        }
        
        if(carry!=0){
            n3.add(carry);
        }
        System.out.println(n3);
        
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
       
       new My().add(l1,l2);
   }
}