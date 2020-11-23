import java.util.Arrays;

public class MissingNumberFinderArr {
    public static void main(String[] args){

        int [] numArr={1,2,3,4,5,6,7,8,10};

        int expectedSum=0;
        int sum=0;

        for (int i=0; i<numArr.length; i++){
            sum=sum+numArr[i];
        }

        for (int i=1; i<=10; i++) {
            expectedSum=expectedSum+i;
        
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println("The missing number is "+(expectedSum-sum));

    }
}
