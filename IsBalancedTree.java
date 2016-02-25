Boolean isBalanced(Node a){
       if(a==null){
           return true;
       }
       int l = height(a.left);
       int r = height(a.right);
       
       if(Math.abs(l-r)<=1 && isBalanced(a.left)&& isBalanced(a.right)){
           return true;
       }
       return false;
   }