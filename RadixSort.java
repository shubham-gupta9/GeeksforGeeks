 void radixsort(int arr[]){
       int max = arr[0];
       for(int i =0;i<arr.length;i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
       int count =0;
       while(max>0){
           max = max/10;
           count++;
       }
       int[] result = new int[arr.length];
       Arrays.fill(result, 0);
       for(int i =0;i<count;i++){
           int exp = (int)Math.pow(10, i);
           int[] my = new int[10];
           Arrays.fill(my, 0);
           
           for(int j =0;j<arr.length;j++){
               my[(arr[j]/exp)%10]++;
           }
           
           for(int j =1;j<my.length;j++){
               my[j] +=my[j-1];
           }
           
           for(int j =arr.length-1;j>=0;j--){
               result[my[(arr[j]/exp)%10]-1] = arr[j];
               my[(arr[j]/exp)%10]--;
           }
           for(int j =0;j<arr.length;j++){
               arr[j] = result[j];
           }
          
       }
         System.out.println(Arrays.toString(result));
   }