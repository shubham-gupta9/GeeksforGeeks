void Leaders(int arr[]){
    int in = arr.length-1;
    System.out.print(arr[in]+" ");
    for(int i = arr.length-2;i>=0;i--){
        if(arr[i]>arr[i+1] && arr[i]>arr[in]){
            in = i;
            System.out.print(arr[in]+" ");
        }
        
    }
}