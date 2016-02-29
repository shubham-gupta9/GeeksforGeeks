void HeapifyArr(int arr[],int n){
        
        for(int i = (n-1)/2;i>=0;i--){
            if(((2*i)+1)<n && arr[(2*i)+1]>arr[i]){
                int temp = arr[(2*i)+1];
                arr[(2*i)+1] = arr[i];
                arr[i] = temp;
            }
            if(((2*i)+2)<n && arr[(2*i)+2]>arr[i]){
                int temp = arr[(2*i)+2];
                arr[(2*i)+2] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    void HeapSort(int arr[]){
      int num = arr.length;
      
      for(int i =0;i<num;i++){
          HeapifyArr(arr,num);
          int temp = arr[0];
          arr[0] = arr[num-1];
          arr[num-1] = temp;
          num--;   
      }
      
      System.out.println(Arrays.toString(arr));
        
    }