class pair{
     int a;
     int b;
     pair(int x,int y){
         a = x;
         b = y;
     }
 };
 void fourelements(int arr[]){
     Hashtable<Integer,pair> ht = new Hashtable<Integer,pair>();
     for(int i =0;i<arr.length;i++){
         for(int j  =i+1;j<arr.length;j++){
             int sum = arr[i]+arr[j];
             if(!ht.containsKey(sum)){
                 ht.put(sum, new pair(i,j));
             }
             else{
                 pair p = ht.get(sum);
                 System.out.println("Pair 1= "+arr[p.a]+","+arr[p.b]+" Pair 2 = "+arr[i]+","+arr[j]);
                 return;
                 
             }
         }
     }
     System.out.println("No pair found");
     
 }