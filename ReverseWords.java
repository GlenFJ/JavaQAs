public class ReverseWords {

    public static void main(String[] args){

        String str = "How are you";
        
        String [] arr = str.split(" ");
        
        String result = "";

        for(String word: arr){

            String reverseword = "";
            int j = word.length()-1;

            while(j>=0){
                char ch= word.charAt(j);
                reverseword=reverseword+ch;
                j--;

            }
            result = result + reverseword + " ";


        }

        System.out.println(result);

    }
    
}
