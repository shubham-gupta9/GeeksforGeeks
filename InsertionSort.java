void InsertionSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            
            
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]= key;
            
        }
      System.out.println(Arrays.toString(arr)); 
    }