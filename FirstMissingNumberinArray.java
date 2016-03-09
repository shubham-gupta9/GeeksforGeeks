int FirstMissingNumber(int arr[],int l, int h){
      if(l>h){
          return h+1;
      }
      
      if(l != arr[l]){
          return l;
      }
      
      int middle = (l+h)/2;
      if(arr[middle]>middle){
          return FirstMissingNumber(arr, l, middle);
      }
      else{
          return FirstMissingNumber(arr, middle+1, h);
      }
  }