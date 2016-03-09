void CheckDisjointSets(Set s1,Set s2){
     HashSet<Integer> hs = new HashSet<Integer>();
     Iterator i = s1.iterator();
     while(i.hasNext()){
             hs.add((int)i.next());
     }
     
     Iterator k = s2.iterator();
     while(k.hasNext()){
         if(hs.contains((int)k.next())){
             System.out.println("Not Disjoint ");
             return;
         }
         else{
             hs.add((int)k.next());
         }
     }
     System.out.println("Disjoint");
 }