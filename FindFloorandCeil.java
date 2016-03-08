 void floorCeil(int arr[],int x){
     int ceil = ceilSerach(arr, 0, arr.length-1, x);
     int floor = floor(arr,0,arr.length-1,x);
     
     if(floor!=-1 && ceil!= -1){
         System.out.println(arr[floor]+" "+arr[ceil]);
         return;
     }
     
 }  
 
 int ceilSerach(int arr[], int  l,int h, int x){
     if(x<arr[l]){
         return l;
     }
     
     if(x>arr[h]){
         return -1;
     }
     
     int middle = (l+h)/2;
     if(arr[middle]==x){
         return middle;
     }
     
     if(arr[middle]<x){
         if(middle+1<=h && arr[middle+1]>=x){
             return middle+1;
         }
         else{
             return ceilSerach(arr, middle+1, h, x);
         }
     }
     
     if(arr[middle]>x){
         if(middle-1<=l && arr[middle-1]<x){
             return middle;
         }
         else{
             return ceilSerach(arr, l, middle-1, x);
         }
     }
     return -1;
 }
 
 int floor(int arr[],int l,int h ,int x){
     if(x<arr[l]){
         return -1;
     }
     if(x>arr[h]){
         return h;
     }
     
     int mid = (l+h)/2;
     if(arr[mid]==x){
         return mid;
     }
     
     if(arr[mid]>x){
         if(mid-1>=l && arr[mid-1]<x){
             return mid-1;
         }
         else{
             return floor(arr,l,mid-1,x);
         }
     }
     
     if(arr[mid]<x){
         if(mid+1<=h && arr[mid+1]>x){
             return mid;
         }
         else{
             return floor(arr,mid+1,h,x);
         }
     }
     return -1;
 }