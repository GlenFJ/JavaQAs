
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;

public class DuplicatesInArray{

    public static void main(String[] args){

        int[] numArr={2,3,5,6,5,3,2,5};

        //DuplicatesInArray.findDuplicateUsingBruteForce(numArr);
        //DuplicatesInArray.findDuplicatesUsingSorting(numArr);
        //DuplicatesInArray.findDuplicatesUsingHashSet(numArr);
        DuplicatesInArray.findDuplicatesUsingHashMap(numArr);
    }

    public static void findDuplicateUsingBruteForce(int[] arr) {

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element found: "+arr[i]);
                }
            }
        }
    }

    public static void findDuplicatesUsingSorting(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                System.out.println("The Duplicate Element is: "+ arr[i]);
            }
        }

    }

    public static void findDuplicatesUsingHashSet(int[] arr){
        Set<Integer> hs = new HashSet<Integer>();

        for(int x: arr){
            if(!hs.add(x)){
                System.out.println("The Duplicate Element is: "+x);
            }

    }
    
}
public static void findDuplicatesUsingHashMap(int[] arr){
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    for(int x: arr){
        if(!hm.containsKey(x)){
            hm.put(x,1);
        }else{
            hm.put(x, hm.get(x)+1);
        }

    }for(Integer x: hm.keySet()){
        if(hm.get(x)>1){
            System.out.println("Duplicate Element is: "+ x);
        }
    }
}
}
