public class ReverseSentence {

    public static void main(String[] args){

        String str =  "We are learning Java";

        String[] arr = str.split(" ");

        String result="";

        for (int i = arr.length-1; i >=0; i--) {
            //System.out.print(arr[i]+" ");
            result = result + arr[i] + " ";
        }

        System.out.println(result);
    }
    
}
