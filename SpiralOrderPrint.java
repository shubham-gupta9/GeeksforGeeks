 void Spiral(Node a){
      Queue<Node> s1 = new LinkedList();
      Stack<Node> s2 = new Stack<Node>();
      
      if(a==null){
          return;
      }
      s1.add(a);
      int flag =0;
      while(!s1.isEmpty()){
          Iterator i = s1.iterator();
          while(i.hasNext()){
              Node l = (Node)i.next();
              System.out.print(Node.getdata(l)+" ");
          }
         //System.out.println();
          while(!s1.isEmpty()){
              Node g = s1.remove();
              s2.push(g);
          }
          
         while(!s2.empty()){
             Node k = s2.pop();
             if(flag ==0){
                 if(k.left!=null){
                     s1.add(k.left);
                 }
                 if(k.right!=null){
                     s1.add(k.right);
                 }
             }
             else{
                 if(k.right!=null){
                     s1.add(k.right);
                 }
                 if(k.left!=null){
                     s1.add(k.left);
                 }
             }
            
         }
          if(flag==0){
                 flag =1;
             }
             else{
                 flag = 0;
             }
         
      
  }}
         