 int size(Node a){
        int len = 0;
        if(a==null){
            return 0;
        }
        if(a!= null){
            len = size(a.left)+1+size(a.right);
        }
        return len;
    }