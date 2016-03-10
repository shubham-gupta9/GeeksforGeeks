void Violation(String[] arr){
        HashSet<Integer> hs = new HashSet<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        int flag =0;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            String[] my = arr[i].split(" ");
            if(my[0].equals("Acquire") && !hs.contains(Integer.parseInt(my[1]))){
                hs.add(Integer.parseInt(my[1]));
                s.push(Integer.parseInt(my[1]));
            }
            else if(my[0].equals("Acquire") && hs.contains(Integer.parseInt(my[1]))){
                flag = 1;
                index = i;
                break;
            }
            else if(my[0].equals("Release") && (s.peek()==Integer.parseInt(my[1]))){
            s.pop();
            hs.remove(Integer.parseInt(my[1]));
            
        }
            else if(my[0].equals("Release") && (s.peek()!=Integer.parseInt(my[1]))){
                flag=1;
                index =i;
                break;
            }
            
        }
        if(flag==1){
            System.out.println(index);
        }
        else{
            if(!s.empty()){
                System.out.println(arr.length);
            }
            else{
                System.out.println(0);
            }
        }
        
    }