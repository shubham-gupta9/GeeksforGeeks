 int candidate(int arr[]){
       int maj_in = 0; 
       int count = 1;
       for(int i =1;i<arr.length;i++){
           if(arr[maj_in]==arr[i]){
               count++;
           }else{
           count--;
       }
           if(count==0){
               maj_in=i;
               count =1;
           }
       }
       return arr[maj_in];
   }
   
   void MajorityElement(int arr[]){
       int can = candidate(arr);
       int count=0;
       for(int i =0;i<arr.length;i++){
           if(arr[i]==can){
               count++;
           }
       }
       
       if(count>arr.length/2){
           System.out.println("Candidate "+can);
       }
       else{
           System.out.println("None");
       }
   }