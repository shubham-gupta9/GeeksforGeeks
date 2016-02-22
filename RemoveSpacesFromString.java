void RemoveSpaces(String a){
        StringBuilder s = new StringBuilder();
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                s.append(a.charAt(i));
            }
        }
        a = s.toString();
        System.out.println(a);
    }