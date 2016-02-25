 Boolean identicalTrees(Node a,Node b){
        if(a==null && b == null){
            return true;
        }
        if(a!=null && b!=null){
          if(a.data==b.data){
              return identicalTrees(a.left,b.left)&&identicalTrees(a.right,b.right);
          }
            
        }
        return false;
    }
   