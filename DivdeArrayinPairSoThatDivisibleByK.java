void DivideArrayinPairDivisiblebyK(int arr[],int k){
     if(arr.length%2==1){
         System.out.println("False");
         return;
     }
     
     int[] my = new int[k];
     Arrays.fill(my, 0);
      for(int i =0;i<arr.length;i++){
          my[arr[i]%k] +=1;
      }
      
    
     for(int i=1;i<my.length;i++){
         if(my[i]!=my[k-i]){
             System.out.println("false");
             return;
         }
     }
     
     if(my[0]%2==0){
         System.out.println("True");
     }
     else{
         System.out.println("False");
     }
 }
