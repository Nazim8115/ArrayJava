//write a function return sum of array
public class Arraysum {
    public static int sum(int [] arr){
        int sum = 0 ;
        for(int i =0;i< arr.length;i++){
            sum = sum +arr[i];
        }
        return sum;
    }
//Driver code
    public static void main(String[] args) {
        int arr_1[] = {5,8,5,2,15};
        int res = sum(arr_1);
        System.out.println(res);
    }
}
