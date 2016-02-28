void print(Node a){
       if(a==null){
           return;
       }
       Node temp = a;
       
       do{
           System.out.println(temp.data);
           temp = temp.next;
       }while(temp!=a);
   } 