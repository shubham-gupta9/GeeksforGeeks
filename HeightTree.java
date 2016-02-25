int height(Node a){
       if(a==null){
           return 0;
       }
       
       if(a!=null){
          int l = height(a.left);
          int r = height(a.right);
          if(l>r){
              return l+1;
          }
          else{
           return r+1;
       }
       }
       return 0;
   }
        