void InOrder(Node a){
        Stack<Node> s = new Stack<Node>();
        if(a==null){
            return;
        }
        Node h = null;
        Node current = a;
        while(current!=null ||!s.isEmpty())
            if(current!=null){
            s.add(current);
            current = current.left;
            }
            else if(current == null && !s.isEmpty()){
                h = s.pop();   
                System.out.println(h.data);
                current = h.right;
            }
            
        }