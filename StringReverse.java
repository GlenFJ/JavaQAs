

public class StringReverse{

    public static void main(String[] args) {

        //String str = "java";
        String str = "abcedefghijklmnopqrstuvwxyz";
        
        //#1 Using StringBuffer Class
        
        StringBuffer sb = new StringBuffer(str);
        
        String result= sb.reverse().toString();

        System.out.println(result);

        //#2 Without using StringBuffer class

        String result1="";

        for (int i = str.length()-1; i>=0; i--) {
            result1 = result1 + str.charAt(i);
        }

        System.out.println(result1);
        
        }
}