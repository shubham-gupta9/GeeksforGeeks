void Equilibrium(int arr[]){
       int sum = 0;
       for(int i =0;i<arr.length;i++){
           sum += arr[i];
       }
       int l =0;
       for(int i =0;i<arr.length;i++){
         if(l == sum -l -arr[i]){
             System.out.println(i);
             break;
         }  
         else{
             l += arr[i];
         }
       }
   }