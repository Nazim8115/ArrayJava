public class Arrange_array {
    public static void arrange(int arr[],int n ){
        int p =1;
        int q;
        if(n%2==0){
            q = n;
        }
        else {
            q = n-1;
        }

        for(int i =0;i<n;i++){
            if(p<=n){
                arr[i] = p;
                p = p+2;
            }
            else{
                arr[i] = q;
                q = q-2;
            }
        }
    }
//    driver code
    public static void main(String[] args) {
        int n = 9;
        int arr[] = new int[n];
        arrange(arr,n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
