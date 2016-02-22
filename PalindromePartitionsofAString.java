void PalindromicPartitions(String a){
        HashSet hs = new HashSet();
        
        for(int i =0;i<a.length();i++){
            for(int j =i ;j<a.length();j++){
                if(i==0){
                    System.out.print(a.charAt(j)+" ");
                    continue;
                }
                if(!hs.contains(a.substring(i,j+1))){
                   if(i!=j){
                       Boolean l = isPalindrome(a.substring(i,j+1));
                       if(l){
                           hs.add(a.substring(i,j+1));
                          for(int k =0;k<i;k++){
                              System.out.print(a.charAt(k)+" ");
                          }
                          System.out.print(a.substring(i, j+1)+" ");
                          for(int k =j+1;k<a.length();k++){
                              System.out.print(a.charAt(k)+" ");
                          }
                          
                       }
                   }
                    
                
                }
            }System.out.println();
        }
    }
    