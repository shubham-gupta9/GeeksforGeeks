  Map<Integer, List<Integer>> mp = new HashMap<Integer, List<Integer>>();
    for(int i =1;i<=v;i++){
      mp.put(i,new LinkedList<Integer>());
    }
     for(int i =0;i<mp.size();i++){
         System.out.println(i+" "+mp.get(i));
     }   