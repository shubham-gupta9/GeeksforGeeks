void product(int arr[]){
    int[] left = new int[arr.length];
    int [] right = new int[arr.length];
    left[0] = 0;
    int temp = 1;
    for(int i =1;i<arr.length;i++){
        
        temp *= arr[i-1];
        left[i] = temp;
    }
    
    right[arr.length-1]= 0;
    temp =1;
    for(int i = arr.length-2;i>=0;i--){
        temp *= arr[i+1];
        right[i] = temp;
    }
    
    for(int i =0;i<arr.length;i++){
        if(left[i]==0){
            left[i] = right[i];
        }
        else if(right[i]==0){
            left[i] = left[i];
        }
        else{
            left[i] = left[i] *right[i];
        }
    }
    System.out.println(Arrays.toString(left));
    
}