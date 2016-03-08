void Segregate012(int arr[]){
       int low = 0;
       int mid = 0;
       int h = arr.length-1;
       
       while(mid <= h){
           if(arr[mid]==0){
               int temp = arr[low];
               arr[low] = arr[mid];
               arr[mid] = temp;
               low++;
               mid++;
           }
           else if(arr[mid]==1){
               mid++;
           }
           else{
               int temp = arr[mid];
               arr[mid]  = arr[h];
               arr[h] = temp;
               h--;
           }
       }
       System.out.println(Arrays.toString(arr));
   }