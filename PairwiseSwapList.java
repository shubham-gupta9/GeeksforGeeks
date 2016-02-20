 void MergeListAlter(Node a){
      Node temp = a;
      Node prev= null;
      Node my = null;
      int i =0;
      while(temp!=null && temp.next!=null){
          Node f = null;
       if(i==0){
           f = temp.next;
           temp.next = temp.next.next;
           f.next = temp;
           my = f;
           prev = temp;
           temp = temp.next;
           i++;
       }
       else{
           
           f = temp.next;
           temp.next = temp.next.next;
           f.next = temp;
           prev.next = f;
           prev = temp;
           temp = temp.next; 
   }}
      print(my);
   }