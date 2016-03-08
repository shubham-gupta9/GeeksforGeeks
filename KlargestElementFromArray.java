void klargest(int arr[],int k){
     int n = arr.length;
     for(int i =0;i<k;i++){
         int l = MaxHepify(arr,n);
         n--;
         System.out.print(l+" ");
     }
 }
       
 int  MaxHepify(int arr[],int n){
     int in = n/2-1;
     
     for(int i = in;i>=0;i--){
      
         if(arr[i]<arr[2*i+1]){
            
             int temp = arr[i];
             arr[i] = arr[2*i+1];
             arr[2*i+1]= temp;
         }
         if((2*i+2)<n && arr[i]<arr[2*i+2]){
           
             int temp = arr[i];
             arr[i] = arr[2*i+2];
             arr[2*i+2]= temp;
         }
         
     }
    int temp = arr[0];
    arr[0] = arr[n-1];
    arr[n-1] = temp;
    return temp;
 }    