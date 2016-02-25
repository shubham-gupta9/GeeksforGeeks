 void printPath(Node a){
       int[] path= new int[1000];
       printallPath(a,path,0);
   }
   void printallPath(Node a,int[] path,int pathlen){
       if(a==null){
           return;
       }
       
       path[pathlen]= a.data;
       pathlen++;
       
       if(a.left==null&&a.right==null){
           int i =0;
           while(pathlen>0){
               System.out.print(path[i]+" ");
               pathlen--;
               i++;
           }
           System.out.println();
       }
       else{
           printallPath(a.left,path,pathlen);
           printallPath(a.right,path,pathlen);
       }
   }