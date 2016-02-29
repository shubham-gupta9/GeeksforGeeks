  int partition(int arr[], int l,int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j = l;j<r;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[r] = temp;
        //System.out.println("Quicksort "+Arrays.toString(arr));
        return i;
    }
    
    void Quicksort(int arr[],int l ,int r){
        if(l<r){
            int p = partition(arr, l ,r);
            Quicksort(arr,l,p-1);
            Quicksort(arr,p+1,r);
        }
    }