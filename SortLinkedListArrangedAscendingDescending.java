 void AscDesc(Node a){
       if(a==null ||a.next==null){
           return;
       }
       Node g = null;
       Node temp =a;
       while(temp!=null&&temp.next!=null){
           Node ch = temp.next;
           temp.next = temp.next.next;
           temp = temp.next;
               ch.next = g;
               g = ch;
       }
       Node res = null;
       Node k=null;
       temp = a;
       while(temp!=null && g!=null){
           if(temp.data<g.data){
               Node ch = temp;
               temp = temp.next;
               ch.next = null;
               if(res==null){
                   res = ch;
                   k = res;
               }
               else{
                   res.next = ch;
                   res = res.next;
               }
               

           }
           else{
               Node ch = g;
               g = g.next;
               ch.next = null;
               if(res==null){
                   res = ch;
                   k = res;
               }
               else{
                   res.next = ch;
                   res = res.next;
               }
             
               
               

           }
       }
       if(temp!=null){
           res.next = temp;
       }else{
           res.next = g;
       }
      print(k); 
       
   }