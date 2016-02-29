 void MergeSort(int arr[], int l ,int r){
        if(l<r){
            int mid  = (int)Math.floor((l+r)/2);
            MergeSort(arr,l,mid-1);
            MergeSort(arr,mid+1,r);
            Merge(arr, l , mid, r);
        }
    }
    
    void Merge(int arr[], int l , int m , int r){
        int n1 = m-l+1;
        int n2 = r -m;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i =0;i<n1;i++){
            L[i] = arr[l+i];
        }
        for(int j =0;j<n2;j++){
            R[j] = arr[m+1+j];
        }
        
        int i =0;
        int j = 0;
        int k =l;
        
        while(i<n1 && j < n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                k++;
                i++;
            }
            else{
                arr[k] = R[j];
                k++;
                j++;
            }
        }
        
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
         while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    public static void main(String[] args) throws IOException {
       Searching s = new Searching();
       int[] arr = {12,11,13,5,6,7};
//       for(int i =0;i<100;i++){
//           arr[i] =  (int)(Math.random()*(100)+7);
//       }
       //long st = System.currentTimeMillis();
       s.MergeSort(arr,0,arr.length-1);
       //long et = System.currentTimeMillis();
       //System.out.println("time "+ (et-st));
       System.out.println(Arrays.toString(arr));
    }