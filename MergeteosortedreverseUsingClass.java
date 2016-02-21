 void MergeListReverse(LinkedList n1,LinkedList n2){
        if(n1.isEmpty() && n2.isEmpty()){
            return;
        }
        LinkedList res = new LinkedList();
        if(n1.isEmpty()^n2.isEmpty()){
            if(n1.isEmpty()){
                res = n2;
            }
            else{
                res = n1;
            }
        }
        int i =0;
        int j =0;
        while(i<n1.size()&&j<n2.size()){
            if((int)n1.get(i)<(int)n2.get(j)){
                res.add(0,(int)n1.get(i));
                i++;
            }
            else{
                res.add(0,(int)n2.get(j));
                j++;
            }
        }
        
        if(i<n1.size()){
            while(i<n1.size()){
                res.add(0,(int)n1.get(i));
                i++; 
            }
        }
        else{
            while(j<n2.size()){
                res.add(0,(int)n2.get(j));
                j++; 
            }
        }
       System.out.println(res); 
    }