import java.util.Arrays;

public class LargestSmallestElementArray {
    public static void main(String[] args) {

        int [] arr = {2, 8, 9, 30, 50, 3, 89, 91};

        int largest = arr[0];
        int smallest=arr[0];
        
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }else if(arr[i] < smallest){
                smallest= arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The Largest number in given array is "+largest);
        System.out.println("The Smallest number in given array is "+smallest);

    }
}
