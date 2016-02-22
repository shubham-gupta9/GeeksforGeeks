void PalindromicPartitions(String a){
        HashSet hs = new HashSet();
        
        Boolean l= false;
        for(int i =0;i<a.length();i++){
            for(int j =i ;j<a.length();j++){
                if(i==0){
                    System.out.print(a.charAt(j)+" ");
                    if(j<(a.length()-1)){
                    continue;
                    }
                    else{
                        System.out.println();
                    }
                }
                if(!hs.contains(a.substring(i,j+1))){
                   if(i!=j){
                        l = isPalindrome(a.substring(i,j+1));
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
                
            }if(l)System.out.println();
        }
    }