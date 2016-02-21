void Rearrange(LinkedList n1){
        int n = n1.size()/2;
        for(int i =0;i<n;i++){
            int d = (int)n1.get(n1.size()-1);
            n1.remove(n1.size()-1);
            n1.add(i+1,d);
            i++;
            n++;
        }
        System.out.println(n1);
    }