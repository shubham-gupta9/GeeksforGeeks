void MergeListReverse(Node a,Node b){
       if(a==null && b==null){
           return;
       }
       
       Node res=null;
       if(a==null^b==null){
           if(a==null){
               res = Reverse(b);
           }
           else{
               res = Reverse(a);
           }
       }
      
       Node t1 = a;
       Node t2 = b;
       while(t1!=null && t2!=null){
           if(t1.data<t2.data){
               Node ch = t1;
               t1 = t1.next;
               ch.next = res;
               res = ch;
           }
           else{
               Node ch = t2;
               t2 = t2.next;
               ch.next = res;
               res = ch;
           }
       }
       if(t1!=null){
           while(t1!=null){
               Node ch = t1;
               t1 = t1.next;
               ch.next = res;
               res = ch;
           }
       }else{
           while(t2!=null){
            Node ch = t2;
               t2 = t2.next;
               ch.next = res;
               res = ch;
       }
       }
       print(res);
   }
          