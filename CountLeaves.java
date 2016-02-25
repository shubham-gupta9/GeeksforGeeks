 int leaf(Node a){
       if(a==null){
           return 0;
       }
       else if(a.left==null&&a.right==null){
           return 1;
       }
       int count=0;
       if(a!=null){
            count = leaf(a.left)+leaf(a.right);
       }
 return count;
   }