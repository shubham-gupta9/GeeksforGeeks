void sortedInsert(Node a, int n){
       if(a==null){
          Node my = new Node(n);
          a = my;
       }
       
       Node temp = a;
       
       if(temp.data>n){
           do{
               temp = temp.next;
           }while(temp.next!=a);
           Node my = new Node(n);
       my.next = temp.next;
       temp.next = my;
       a = my;
       print(a);
       return;
       }
       
       
       while(temp.next.data<n){
           temp = temp.next;
           
       }
       Node my = new Node(n);
       my.next = temp.next;
       temp.next = my;
       
       
   }