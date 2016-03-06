void Numberodd(int arr[]){
     int res=0;
     for(int i =0;i<arr.length;i++){
         res ^= arr[i];
     }
     System.out.println(res);
 }