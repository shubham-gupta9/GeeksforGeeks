void SubSequenceofOther(String a,String b){
       int j =0;
       for(int i =0;i<b.length();i++){
           if(b.charAt(i)==a.charAt(j) && j<a.length()){
               j++;
           }
       }
       if(j==a.length()){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
   }