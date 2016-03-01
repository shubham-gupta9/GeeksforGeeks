void countbits(int n){
       int count=0;
       for(int i =1;i<=n;i++){
           String a = Integer.toBinaryString(i);
           for(int j =0;j<a.length();j++){
               if(a.charAt(j)=='1'){
                   count++;
               }
           }
       }
       System.out.println(count);
   }