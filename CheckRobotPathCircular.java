void RobotPath(String a){
       int dir = 1;
       int x = 0;
       int y = 0;
       for(int i =0;i<a.length();i++){
           if(a.charAt(i)=='G' && dir==1){
               y++;
           }
           else if(a.charAt(i)=='G' && dir==2){
               x++;
           }
           else if(a.charAt(i)=='G' && dir==3){
               y--;
           }
           else if(a.charAt(i)=='G' && dir==4){
               x--;
           }
           else if(a.charAt(i)=='L'){
               if(dir==1){
                   dir=4;
               }
               else if(dir==2){
                   dir =1;
               }
               else if(dir ==3){
                   dir = 2;
               }
               else{
                   dir = 3;
               }
           }
           else{
               if(dir==1){
                   dir=2;
               }
               else if(dir==2){
                   dir =3;
               }
               else if(dir ==3){
                   dir = 4;
               }
               else{
                   dir = 1;
               }
           }
       }
       if(x==0 && y==0){
           System.out.println("circular");
       }
       else{
           System.out.println("not circular");
       }
   }