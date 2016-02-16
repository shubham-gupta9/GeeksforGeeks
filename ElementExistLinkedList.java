
import java.util.LinkedList;

public class My extends LinkedList{
    boolean exist(LinkedList a,int val){
        if(a.isEmpty()){
            return false;
        }
        else if(a.contains(val)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        boolean res = new My().exist(l1, 1);
        System.out.println(res);
    }
}