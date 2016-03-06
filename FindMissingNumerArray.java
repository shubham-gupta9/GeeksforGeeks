void MissingNumber(int arr[],int n){
     int x1 = 0;
     for(int i =1;i<=n+1;i++){
         x1 ^=i;
     }
     int x2 = 0;
     for(int i=0;i<arr.length;i++){
         x2 ^= arr[i];
     }
     
     int x3 = x1^x2;
     System.out.println(x3);
 }