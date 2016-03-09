 void ConsecutiveElement(int arr[]){
       int[] visit = new int[arr.length];
       Arrays.fill(visit, 0);
       int min = arr[0];
       for(int i =1;i<arr.length;i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }

       for(int i =0;i<arr.length;i++){
           if((arr[i]-min)<arr.length ){
               
               if(visit[arr[i]-min]==0){
           visit[arr[i]-min] = -1;
               }
               else{
               System.out.println("Not Consecutive");
               return;
               
           }
           
       }
           else{
               System.out.println("Not Consecutive");
               return;
           }
           
   }
       System.out.println("Consecutive");
   }