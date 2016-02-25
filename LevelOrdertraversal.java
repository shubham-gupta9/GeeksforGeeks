void LevelOrder(Node a ){
        if(a==null){
            return;
        }
        Node temp = a;
        Queue<Node> q  = new LinkedList<Node>();
        
        q.add(temp);
        System.out.println(temp.data);
        while(!q.isEmpty()){
         Node f= q.remove();
         if(f.left !=null){
             q.add(f.left);
             System.out.print(f.left.data+" ");
         }
         if(f.right!=null){
             q.add(f.right);
             System.out.print(f.right.data+" ");
         }
         System.out.println();
         
        }
    }