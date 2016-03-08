void MaxSum(int arr[]){
     int diff = arr[1]-arr[0];
     int curr = diff;
     int maxsum = curr;
     
     for(int i = 1;i<arr.length-1;i++){
         diff = arr[i+1]-arr[i];
         if(curr>0){
             curr +=diff;
         }
         else{
         curr = diff;
     }
         if(curr>maxsum){
             maxsum = curr;
         }
     }
     System.out.println(maxsum);
 } 