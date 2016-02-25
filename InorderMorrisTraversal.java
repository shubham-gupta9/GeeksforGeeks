  void InOrder(Node a){
        
        
        Node current = a;
        Node pre = null;
        while(current!=null ){
           if(current.left == null){
               
              
               System.out.println(current.data);
               current = current.right;
           }
           else{
              
               pre = current.left;
               while(pre.right!=null && pre.right!=current)
                   pre = pre.right;
               if(pre.right == null){
               
                   pre.right = current ;
                   current = current.left;
                   
               }
               else{
                    pre.right = null;
                    System.out.println(current.data);
                    current = current.right;
               }
                
               
         
            
        }
        }
    }