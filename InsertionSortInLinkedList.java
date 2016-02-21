void InsertionSort(Node a){
       if(a== null){
           return;
       }
       Node res = null;
       Node start = null;
       Node h =null;
       while(a!=null){
           h = a;
           a = a.next;
          if(res == null){
              h.next = res;
              res = h;
              start = res;
          } 
          else{
              res = start;
              
                  if(res.data>h.data){
                     
                    h.next=start;
                    start = h;
                  }
                  else{
                      while(res.next!=null){
                          if(res.next.data<h.data){
                          res = res.next;
                      }
                          else{
                              break;
                          }
                      
                      
                  }
                      h.next = res.next;
                      res.next = h;
                  }
              }
              
       }
          
   
       print(start);
   }