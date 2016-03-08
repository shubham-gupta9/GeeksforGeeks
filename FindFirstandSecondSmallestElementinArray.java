void FindSmallestandSecondSmallest(int arr[]){
       int first = Integer.MAX_VALUE;
       int second = Integer.MAX_VALUE;
       
       for(int i =0;i<arr.length;i++){
           if(arr[i]<first){
               second = first;
               first = arr[i];
               
           }
           else if(arr[i]<second && arr[i]>first){
               second = arr[i];
           }
       }
       System.out.println("First "+first);
       System.out.println("Second "+second);
   }