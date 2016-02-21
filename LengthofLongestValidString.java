void ValidString(String a){
       Stack s = new Stack();
       int count=0;
       for(int i =0;i<a.length();i++){
           if(a.charAt(i)=='('){
               s.push(a.charAt(i));
           }
           else if(a.charAt(i)==')' && !s.empty()){
               s.pop();
               count+=2;
           }
           else{
               continue;
           }
       }
       System.out.println(count);
   }