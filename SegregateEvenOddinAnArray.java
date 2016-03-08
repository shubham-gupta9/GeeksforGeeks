void SegEvenAndOdd(int arr[]){
    int l = 0;
    int r = arr.length-1;
    
    while(l<r){
        if(arr[l]%2==0 && arr[r]%2==1){
            l++;
            r--;
        }
        else if(arr[l]%2==1 && arr[r]%2==0){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        else if(arr[l]%2==0){
            l++;
        }
        else{
            r--;
        }
    }
    System.out.println(Arrays.toString(arr));
}