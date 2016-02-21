Boolean ischar(char a){
        if(a>='a'&& a<='z'){
            return true;
        }
        else if(a>='A'&& a<='Z'){
            return true;
        }
        return false;
    }
   String ReverseString(String k){
       StringBuffer a = new StringBuffer(k);
       int num = a.length()/2;
       int j =a.length()-1;
       int i =0;
       while(i!=j){
          if(ischar(a.charAt(i))&&ischar(a.charAt(j))){
               
              char temp = a.charAt(i);
              a.setCharAt(i, a.charAt(j));
              a.setCharAt(j,temp);
              i++;
              j--;
          }
          else if(ischar(a.charAt(i))^ischar(a.charAt(j))){
              if(ischar(a.charAt(i))){
                  j--;
              }
              else{
                  i++;
              }
          }
          else{
              i++;
              j--;
          }
       
       }
       k = a.toString();
       return k;
       
   }