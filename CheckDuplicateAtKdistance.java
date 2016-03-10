void DuplicatesAtK(int arr[],int k){
     boolean j = false;
 
     for(int i =0;i<arr.length;i++){
         if((k+i)<arr.length && arr[i+k] == arr[i]){
             j = true;
             break;
         }
         
     }
     
     System.out.println(j);
     
 }
