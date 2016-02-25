void MirrorTree(Node a){
      if(a==null){
          return;
      }
      if(a!=null){
          
          MirrorTree(a.left);
          MirrorTree(a.right);
          
          Node temp = a.left;
          a.left = a.right;
          a.right = temp;
      }
      
      
   }