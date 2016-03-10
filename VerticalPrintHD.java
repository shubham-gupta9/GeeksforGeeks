void Vertical(Node a,int hd,TreeMap<Integer,LinkedList<Integer>> hm){
      
      if(a!=null){
        try{
            hm.get(hd).add(a.data);
            hm.put(hd,hm.get(hd) );
        }
        catch(NullPointerException e){
            LinkedList l = new LinkedList<Integer>();
            l.add(a.data);
            hm.put(hd, l);
        }
        Vertical(a.left,hd-1,hm);
        Vertical(a.right,hd+1,hm);
    }
  
}