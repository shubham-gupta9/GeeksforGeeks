 void VerticalPrint(Node a, int hd, HashMap m){
      if(a==null) {
          return;
      }
      if(m.get(hd)==null){
          m.put(hd,new ArrayList<Integer>().add(a.data));
      }
     
      
      VerticalPrint(a.left,hd-1,m);
      VerticalPrint(a.right,hd+1,m);
      
      
    
   }