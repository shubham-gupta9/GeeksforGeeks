void Majority(int arr[],int x){
       if(arr[arr.length/2]!=x){
           return;
       }
       int n = arr.length;
       int l = BinarySearch(arr,0,(arr.length/2)-1,x);
       int r = BinarySearch(arr,(arr.length/2)+1,arr.length-1,x);
       System.out.println(l+" "+r);
       if((r-l)+1>arr.length/2){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
   }
   
   int BinarySearch(int arr[],int low,int high,int x){
       int middle = (low+high)/2;
       while(low<=high){
           System.out.println(middle+" "+arr[middle]);
       if((middle==0 && arr[middle]==x)||(arr[middle]==x && arr[middle-1]!=x)){
           return middle;
       }
       else if((middle == arr.length-1 && arr[middle]==x)||(arr[middle]==x && arr[middle+1]!=x) ){
           return middle;
       }
      else if((arr[middle])<=x){
           return BinarySearch(arr,middle+1,high,x);
       }
      else if(arr[middle]>x){
           return BinarySearch(arr,low,middle-1,x);
       }
        }
       return -1;
   }
       