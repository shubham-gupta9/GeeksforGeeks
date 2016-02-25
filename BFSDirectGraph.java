import java.io.*;
import java.util.*;
import java.util.LinkedList;



class Solution {
  void addedge(Map<Integer,List<Integer>> m, int src,int des){
    if(src>m.size()||des>m.size()){
      System.out.println("Cant insert");
      return;
    }
    
    List<Integer> s = m.get(src);
    s.add(des);
   
    
  }
  
  void BFS(Map<Integer,List<Integer>> m,int s){
    Queue<Integer> q = new LinkedList<Integer>();
    
    Boolean[] visited = new Boolean[5];
    for(int i =0;i<4;i++){
      visited[i] = false;
    }
    
    visited[s]= true;
    q.add(s);
    
    while(!q.isEmpty()){
      int n = q.remove();
      System.out.print(n+" " );
      List<Integer> k = m.get(n);
      for(int i =0;i<k.size();i++){
        if(!visited[(int)k.get(i)]){
          visited[(int)k.get(i)]= true;
          q.add((int)k.get(i));
        }
      }
    }
  }
  public static void main(String[] args){
    int v = 4;
    Map<Integer, List<Integer>> mp = new HashMap<Integer, List<Integer>>();
    for(int i =0;i<v;i++){
      mp.put(i,new LinkedList<Integer>());
    }
    
    Solution s = new Solution();
    s.addedge(mp,0,1);
    s.addedge(mp,0,2);
    s.addedge(mp,1,2);
    s.addedge(mp,2,0);
    s.addedge(mp,2,3);
    s.addedge(mp,3,3);
    
    
    s.BFS(mp,2);
  }
    
    
  }
