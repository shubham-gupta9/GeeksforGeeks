void SymmetricPairs(int arr[][]){
    LinkedHashMap<Integer,Integer> ht = new LinkedHashMap<Integer,Integer>();
     
     for(int i=0;i<arr.length;i++){
         int a = arr[i][0];
         int b = arr[i][1];
         
         ht.put(a, b);
         
     }
     Iterator i = ht.keySet().iterator();
     while(i.hasNext()){
         int f = (int)i.next();
         int g = (int)ht.get(f);
         if(ht.containsKey(g)){
             int k = (int)ht.get(g);
             if(k ==f){
                 System.out.println("("+f+","+g+")");
             }
             ht.put(g, Integer.MIN_VALUE);
         }
     
 }
 }
