public class LinearSearch {
    public static int linearSearch(int arr[],int x){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

// Driver code
// time complexty : O(n)
//    space complexity : O(n)
    public static void main(String[] args) {
        int arr[] = {1,2,10,50,56};
        int y = 56;
        int res = linearSearch(arr,y);
        System.out.print(res);

    }
}
