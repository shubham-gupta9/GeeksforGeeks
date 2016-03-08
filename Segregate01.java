 void Segregate01(int arr[]){
      int l = 0;
      int r = arr.length-1;
      while(l<=r){
          if(arr[l]==0 && arr[r]==1){
              l++;
              r--;
          }
          else if(arr[l]==1 && arr[r]==0){
              arr[l]=0;
              arr[r]=1;
              l++;
              r--;
          }else if(arr[l]==0){
              l++;
          }
          else{
              if(arr[r]==1){
                  r--;
              }
          }
          
      }
      System.out.println(Arrays.toString(arr));
  }