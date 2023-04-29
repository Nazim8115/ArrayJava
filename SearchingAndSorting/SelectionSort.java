/*
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list
in each iteration and places that element at the beginning of the unsorted list.
 */

public class SelectionSort {
    public static void selection(int arr[]){
        for(int i = 0 ;i<arr.length-1;i++){
            int min_index= i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= temp;
        }
    }


//    arrays print function ...........................
    public static void printArray(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
//    main function for test the code ---------------------
    public static void main(String[] args) {
        int arr [] = {84,83,67,22};
        selection(arr);
        printArray(arr);
        
    }
}

/*
Time Complexity:
    Best Case ---> O(n^2)
    Average Case ---> O(n^2)
    Worst Case ---> O(n^2)
Space complexity O(1)
 */

