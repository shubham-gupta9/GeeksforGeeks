int FixedPoint(int arr[],int l,int h){
     
     while(l<=h){
         int middle = (l+h)/2;
         if(arr[middle]==middle){
             return middle;
         }
         else if(arr[middle]>middle){
             return FixedPoint(arr,0,middle-1);
         }
         else{
             return FixedPoint(arr,middle+1,h);
         }
     }
     return -1;
 }