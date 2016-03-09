void Occurences(int arr[],int x){
 int f = First(arr,0,arr.length-1,x);
 int l = Last(arr,0,arr.length-1,x);
 System.out.println(l-f+1);
 }
 int First(int arr[],int l ,int h ,int x){
    int middle =(l+h)/2;
    while(l<=h){
        if((middle ==0||arr[middle-1]<x)&&arr[middle]==x){
            return middle;
        }
        else if(arr[middle]>=x){
            return First(arr, 0, middle-1,x);
        }
        else {
            return First(arr,middle+1,h,x);
        }
    }
    return -1; 
     
 }
 
 int Last(int arr[], int l ,int h ,int x){
     int middle = (l+h)/2;
     while(l<=h){
         if((middle == h || arr[middle+1]>x)&&arr[middle]==x){
             return middle;
         }
         else if(arr[middle]>x){
             return Last(arr,0,middle-1,x);
         }
         else{
             return Last(arr,middle+1,h,x);
         }
         
     }
     return -1;
 }
