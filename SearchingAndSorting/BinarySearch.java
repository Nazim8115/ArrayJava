public class BinarySearch {
    public static int Bs(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;

    }
//main function and for check and call binary search function (bs)
    public static void main(String[] args) {
        int arr []= {100,200,300,400,500};
        int res = Bs(arr,300);
        System.out.print(res);

    }
}

