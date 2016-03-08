void UnionItersection(int m[],int n[]){
   int i =0;
   int j =0;
   while(i<m.length && j<n.length){
       if(m[i]<n[j]){
           System.out.print(m[i]+" ");
           i++;
       }
       else if(m[i]>n[j]){
           System.out.print(n[j]+" ");
           j++;
       }
       else{
           System.out.print(m[i]+" ");
           i++;
           j++;
       }
   }
   while(i<m.length){
       System.out.print(m[i]+" ");
       i++;
   }
   
   while(j<n.length){
       System.out.print(n[i]+" ");
       j++;
   }
   
   System.out.println();
   i =0;
   j= 0;
   while(i<m.length && j <n.length){
       if(m[i]<n[j]){
           i++;
       }
       else if(m[i]>n[j]){
           j++;
       }
       else{
           System.out.print(n[j]+" ");
           i++;
           j++;
       }
   }
 } 