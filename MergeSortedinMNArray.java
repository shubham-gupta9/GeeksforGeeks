void MovetoEnd(int m[]){
    int j = m.length-1;
    for(int i =m.length-1;i>=0;i--){
        if(m[i]!=-1){
            m[j] = m[i];
            j--;
        }
    }
    
}   
   
   
 void MergeinSorted(int m[],int n[]){
     MovetoEnd(m);
     int i = n.length;
     int j =0;
     int k =0;
     while(k<m.length && i<m.length && j<n.length ){
         
         if(m[i]<=n[j] ){
             
             m[k]=m[i];
             i++;
             k++;
         }
         else{
             
             m[k]=n[j];
             j++;
             k++;
         }
         
     }
     
     while(i<m.length){
         m[k] = m[i];
         i++;
         k++;
     }
     
     while(j<n.length){
         m[k] = n[j];
         j++;
         k++;
     }
     System.out.println(Arrays.toString(m));
     
 }