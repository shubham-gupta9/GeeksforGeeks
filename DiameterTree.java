 int height(Node a){
       if(a==null){
           return 0;
       }
       return 1 + Math.max(height(a.left), height(a.right));
   }
   int Diameter(Node a){
     if(a==null){
         return 0;
     }  
     int l = height(a.left);
     int r = height(a.right);
     
     int ldia = Diameter(a.left);
     int rdia = Diameter(a.right);
     
     return Math.max(l+r+1, Math.max(ldia,rdia));
   }