void indexForSorted(int arr[]){
       int s = 0;
       int e = 0;
       for(int i =1;i<arr.length;i++){
           if(arr[i-1]>arr[i]){
               s = i-1;
               break;
           }
       }
       
       for(int i=arr.length-1;i>=1;i--){
           if(arr[i]<arr[i-1]){
               e = i;
               break;
           }
       }
       
       
       
       int min = arr[s];
       for(int i =s+1;i<=e;i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }
       
       
       int max = arr[s];
       for(int i =s+1;i<=e;i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
        
        
        for(int i =0;i<s;i++){
            if(arr[i]>min){
                s = i;
                break;
            }
        }
        
        for(int i =e+1;i<arr.length;i++){
            if(arr[i]<max){
                e = i;
                break;
            }
        }
        System.out.println("s "+s);
       System.out.println("e "+e);
        
       
   }