void SortbyFrequency(int arr[]){
    LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
    for(int i =0;i<arr.length;i++){
        if(hm.containsKey(arr[i])){
            int v = hm.get(arr[i]);
            hm.put(arr[i],++v);
        }
        else{
            hm.put(arr[i],1);
        }
    }
    LinkedHashMap<Integer,Integer> hn = new LinkedHashMap<Integer,Integer>();
    List<Integer> ls = new ArrayList(hm.keySet());
    List<Integer> ol = new ArrayList(hm.values());
    List<Integer> ld = new ArrayList(hm.values());
    Collections.sort(ld,Collections.reverseOrder());
    Iterator i = ld.iterator();
    while(i.hasNext()){
        int v = (int)i.next();
        if(ol.contains(v)){
            int h = ol.indexOf(v);
            
            int k = ls.get(h);
            
            hn.put(k,v);
            ol.set(h, -1);
            
        }
    }
    
    Set s = hn.entrySet();
    Iterator b = s.iterator();
    while(b.hasNext()){
        System.out.println(b.next());
    }

  

   
   
}