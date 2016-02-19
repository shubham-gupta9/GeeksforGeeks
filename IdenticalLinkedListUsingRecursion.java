Boolean identical(Node a,Node b){
        if(a==null && b == null){
            return true;
        }
        else{
            if(a!=null && b!=null){
                return (a.data==b.data) && identical(a.next,b.next);
            }
        }
        return false;
    }