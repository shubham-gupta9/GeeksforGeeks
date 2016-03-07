int ModifiedBinarySearch(int arr[],int l, int h,int n){
  if(l>h) 
      return -1;
  
  int middle = (l+h)/2;
  if(arr[middle]==n)
      return middle;
  if(arr[l]<=arr[middle]){
      if(n>=arr[l] &&n<=arr[middle]){
          return ModifiedBinarySearch(arr, l, middle-1, n);
      }
      else{
          return ModifiedBinarySearch(arr,middle+1,h,n);
      }
  }else{
      if(n>=arr[middle]&&n<=arr[h]){
          return ModifiedBinarySearch(arr,middle+1,h,n);
      }
     
  
 }
  return ModifiedBinarySearch(arr,l,middle-1,n);
 }