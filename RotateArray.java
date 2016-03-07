void Rotate(int arr[],int d){
    reverse(arr,0,d-1);
    reverse(arr,d,arr.length-1);
    reverse(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
}

void reverse(int arr[], int d,int n){
    int start = d;
    int last = n;
    while(start<last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        start++;
        last--;
    }
}