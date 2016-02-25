class Solution {
  void addedge(Map<Integer,List<Integer>> m, int src,int des){
    if(src>m.size()||des>m.size()){
      System.out.println("Cant insert");
      return;
    }
    
    List<Integer> s = m.get(src);
    s.add(des);
    List<Integer> d = m.get(des);
    d.add(src);
  
    
  }
  public static void main(String[] args){
    int v = 5;
    Map<Integer, List<Integer>> mp = new HashMap<Integer, List<Integer>>();
    for(int i =0;i<v;i++){
      mp.put(i,new LinkedList<Integer>());
    }
    
    Solution s = new Solution();
    s.addedge(mp,0,1);
    s.addedge(mp,0,4);
    s.addedge(mp,1,2);
    s.addedge(mp,1,3);
    s.addedge(mp,1,4);
    s.addedge(mp,2,3);
    s.addedge(mp,3,4);
    
   for(int i =0;i<mp.size();i++){
     System.out.println(i+" "+mp.get(i));
   }
  }
    
    
  }
