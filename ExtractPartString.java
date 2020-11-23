

public class ExtractPartString {

    public static void main(String[] args) {

        String str= "www.erostrum.com";
        //#1 extract firstfour - i.e www.
        //#2 extract lastfour - i.e .com
        //# extract company name - i.e. erostrum


        String firstFour= str.substring(0, 4);
        String lastFour= str.substring(str.length()-4, str.length());
        String companyName = str.substring(4, str.length()-4);

        System.out.println(firstFour + "\n" + lastFour + "\n" + companyName );

    }
    
}
