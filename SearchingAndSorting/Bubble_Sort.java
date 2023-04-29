
public class Bubble_Sort {
    public static void bubbleSort(int arr []){
        int size  = arr.length;
        // for n-1 step
        for(int i = 0 ;i<size-1;i++){
            for(int j = 0 ;j < size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
// Driver code
    public static void main(String[] args) {
        int arr[] = {1,20,14,3,2};
        bubbleSort(arr);
        System.out.println("sorted array is : ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

