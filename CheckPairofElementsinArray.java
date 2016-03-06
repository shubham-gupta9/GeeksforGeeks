void checkElement(int arr[] ,int x){
       HashSet<Integer> hs = new HashSet<Integer>();
       for(int i = 0;i<arr.length;i++){
           if(!hs.contains(arr[i])){
               hs.add(arr[i]);
           }
       }
       int flag = 0;
       int element = 0;
       for(int i =0;i<arr.length;i++){
           int a = x-arr[i];
           if(hs.contains(a)){
               element = arr[i];
               flag = 1;
               break;
           }
       }
       
       if(flag ==1){
           System.out.println("Element with the given sum "+x+" is( "+element+" , "+(x-element)+" )" );
       }
       else{
           System.out.println("Two elements with sum equal to this term does not exist");
       }
       
   }