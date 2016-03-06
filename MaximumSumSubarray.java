void MaximumSumSubarray(int arr[]){
     int curr = arr[0];
     int maxcomp = arr[0];
     for(int i =1;i<arr.length;i++){
         curr = Math.max(arr[i],curr+arr[i]);
         maxcomp = Math.max(curr,maxcomp);
     }
     System.out.println(maxcomp);
 }