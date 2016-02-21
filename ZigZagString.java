void ZigZag(String a,int n){
        StringBuffer[] s = new StringBuffer[n];
        for(int i =0;i<n;i++){
            s[i] = new StringBuffer();
        }
        
        int flag =0;
        int j=0;
        int i =0;
        while(j<a.length()){
            if(i==0){
               flag=0;
            }
            if(i==n-1){
               flag =1;
            }
            
            s[i].append(a.charAt(j));
            //System.out.println(s[i]);
            j++;
            if(flag==0){
                i++;
            }else{
                i--;
            }
            
        }
        StringBuffer f = new StringBuffer();
        for(int l=0;l<n;l++){
            f.append(s[l]);
            
        }
        System.out.println(f);
        
        
        
        
    }