void MaximUmDepthParen(String a){
        int cmax = 0;
        int max = 0;
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)=='('){
                cmax++;
            }
            else if(a.charAt(i)==')' && cmax>0){
                cmax--;
            }
            else if(a.charAt(i)==')' && cmax<=0){
                System.out.println(-1);
                return;
            }
            
            if(cmax>max){
                max = cmax;
            }
        }
        if(cmax==0){
            System.out.println(max);
        }
        else{
            System.out.println(-1);
        }
    }