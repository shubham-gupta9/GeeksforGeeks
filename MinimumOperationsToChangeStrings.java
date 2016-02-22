 void MinimumOperations(String a,String b){
        if(a.length()!=b.length()){
            System.out.println("Can't be transformed");
            return;
        }
        int[] ar = new int[52];
        for(int i =0;i<a.length();i++){
           int g = getAscii(a.charAt(i));
           if(g>64 && g<92){
               g = g-65;
               ar[g]++;
           }
           else if(g>96 && g<123){
               g = g-97;
               ar[g]++;
           }
           
           int h = getAscii(b.charAt(i));
           if(h>64 && h<92){
               h = h-65;
               ar[h]--;
           }
           else if(h>96 && h<123){
               h = h-97;
               ar[h]--;
           }
        }
        
        for(int i =0;i<b.length();i++){
           
        }
        int flag = 0;
        for(int i =0;i<52;i++){
            if(ar[i]>0){
                flag =1;
                break;
            }
        }
        
        if(flag==1){
            System.out.println("Different Character Set cant be Convereted");
        }
        char op = '\0';
        for(int i =a.length()-1;i>=0;i--){
            if(a.charAt(i)!=b.charAt(i)){
                op = b.charAt(i);
                break;
            }
        }
        int count=0;
        if(op!='\0'){
            
            for(int i = 0;i<a.length();i++){
                count++;
                if(a.charAt(i)==op){
                    break;
                }
            }
            
                System.out.println("Operations "+count );
            
        }
        
    }
    
    int getAscii(char a){
        return (int)a;
    }
    