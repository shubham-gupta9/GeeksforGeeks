void PossiblePalindrome(String a){
        
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<a.length();i++){
            for(int j= i ;j<a.length();j++){
                if(!hs.contains(a.substring(i, j+1))){
                   Boolean h = isPalindrome(a.substring(i,j+1));
                   if(h==true){
                   hs.add(a.substring(i, j+1));  }
                }
            }
        }
            
            Iterator is = hs.iterator();
            while(is.hasNext()){
                System.out.println(is.next());
            }
        }
    
    
    Boolean isPalindrome(String a){
        int flag = 0;
        for(int i =0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            return true;
        }else{
            return false;
        }
    }
   