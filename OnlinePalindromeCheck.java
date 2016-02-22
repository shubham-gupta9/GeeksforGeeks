void OnlinePalindrome(String a){
        for(int i =0;i<a.length();i++){
            Boolean j = isPalindrome(a.substring(0,i+1));
            if(j == true){
                System.out.println(a.charAt(i)+" "+"Yes");
            }
            else{
                System.out.println(a.charAt(i)+" "+"No");
            }
        }
    }
    int getAscii(char a){
        return (int)a;
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
   