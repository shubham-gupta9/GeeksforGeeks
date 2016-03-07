void Rotate(int[] arr, int n){
    n = n%(arr.length);
    int i = 0;
    while(i<n){
        int temp = arr[0];
        int j =0;
        for( j =0;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        arr[j] = temp;
        i++;
    }
    System.out.println(Arrays.toString(arr));
}