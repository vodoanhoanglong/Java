/* Trong cửa hàng có n món đồ chơi, giá tiền của món đồ chơi được biểu diễn bằng mảng các số nguyên dương arr, món đồ thứ i có giá arr[i] đồng tiền. 
Bình có k đồng tiền và bình muốn mua được nhiều món đồ chơi nhất có thể. Hãy viết hàm giúp bình xác định xem số đồ chơi tối đa có thể mua được.
*/
public class BT1 {
    private static int numberOfToys(int[] arr, int k)
    {
        int result=0;
        for(int i=0; i<arr.length; i++)
            if(k>=arr[i])
            {
                k-=arr[i];
                result++;
            }    
        
        return result;
    }
    public static void main(String[] args) throws Exception 
    {
        int[] arr1 = {1,2,3};
        int k1 = 4;
        System.out.println(numberOfToys(arr1, k1));


        int[] arr2 = {5, 6, 2, 9, 7, 10, 7};
        int k2 = 2;
        System.out.println(numberOfToys(arr2, k2));
    }

}