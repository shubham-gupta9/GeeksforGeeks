void Itinerary(Hashtable<String,String> ht){
     Hashtable<String,String> reverse = new Hashtable<String,String>();
     Iterator i = ht.keySet().iterator();
   
     while(i.hasNext()){
        String g = (String)i.next();
         reverse.put((String)ht.get(g),g);
         
     }
     
     i = ht.keySet().iterator();
     String g = "";
     while(i.hasNext()){
         g = (String)i.next();
         if(!reverse.containsKey(g))
         {
             break;
         }
     }
     while(ht.get(g)!=null){
         System.out.print(g+" -> "+ht.get(g)+", ");
         g = (String)ht.get(g);
     }
 }