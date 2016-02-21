import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyStrings {
    
    char flipbit(char a){
        return (a=='0')?'1':'0';
    }
    void Onetwocomplement(String a){
        char[] j = a.toCharArray();
        for(int i =0;i<j.length;i++){
            j[i] = flipbit(j[i]);
            
        }
        System.out.println(j);
        char carry = '0';
        int flag = 0;
        for(int i =j.length-1;i>-1;i--){
           if(j[i]=='1'){
               j[i]= flipbit(j[i]);
               
           }
           else{
               j[i]= flipbit(j[i]);
               flag =1;
               break;
           }
        }
        String res = new String(j);
        if(flag ==0){
            res = "1"+res;
        }
        System.out.println(res);
        
    }
    public static void main(String[] args){
        MyStrings m = new MyStrings();
        m.Onetwocomplement("0000");
    }
}
