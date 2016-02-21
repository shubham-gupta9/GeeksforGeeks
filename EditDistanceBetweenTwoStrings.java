 void EditDistance(String a,String b){
        int count=0;
        if(Math.abs(a.length()-b.length())>1){
            System.out.println("No");
            return;
        }
        else{
            int size = 0;
            
            size = a.length()<b.length()?a.length():b.length();
            for(int i =0;i<size;i++){
                if(a.charAt(i)!=b.charAt(i)){
                    count++;
                }
            }
        }
        if(a.length()==b.length()&&(count==1||count==0)){
            System.out.println("Yes");
        }
        else if(a.length()!=b.length() && count==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }