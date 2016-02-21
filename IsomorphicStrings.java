void Isomorphic(String a,String b){
       if(a.isEmpty()&& b.isEmpty()){
           return;
       }
       HashSet h = new HashSet();
       for(int i =0;i<a.length();i++){
           if(!h.contains(a.charAt(i))){
               h.add(a.charAt(i));
           }
       }
       int size1 = h.size();
       for(int i =0;i<b.length();i++){
           if(!h.contains(b.charAt(i))){
               h.add(b.charAt(i));
           }
       }
       if(h.size()==(2*size1)){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
   }