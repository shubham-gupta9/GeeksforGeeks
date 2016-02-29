 void countSort(int arr[])
    {
        int[] my = new int[10];
        for(int i =0;i<arr.length;i++){
            my[arr[i]]++;
        }
        
        for(int i =1;i<my.length;i++){
            my[i] = my[i-1]+my[i];
        }
        
        for(int i =0;i<arr.length;i++){
            arr[i] = my[arr[i]];
            my[arr[i]]--;
        }
        
        System.out.println(Arrays.toString(arr));
    }