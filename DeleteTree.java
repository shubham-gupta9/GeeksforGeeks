void delete(Node a){
      if(a==null){
          return ;
      }
      delete(a.left);
      delete(a.right);
      
      a = null;
      
   }