void SelectionSort(int arr[]){
        int temp = 0;
       for(int i =0;i<arr.length-2;i++){
           int min = i;
           for(int j = i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min = j;
               }
           }
           temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
       
       for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }