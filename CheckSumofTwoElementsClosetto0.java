void SumClosetToZero(int arr[]){
       Arrays.sort(arr);
       int l =0;
       int r =arr.length-1;
       int min = Integer.MAX_VALUE;
       int minl=0;
       int minr=0;
       int sum = 0;
       while(l<r){
           sum = arr[l]+arr[r];
           if(Math.abs(sum)<Math.abs(min)){
               min = sum;
               minl = l;
               minr = r;
           }
               if(sum<0){
                   l++;
               }else{
                   r--;
               }
           }
       System.out.println(arr[minl]+" "+arr[minr]);
       }