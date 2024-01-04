/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        for(int i = 0; i < s.length(); i++){
            Character letter =  s.charAt(i);
            if( (((int) letter) > 64) && (((int) letter) < 91) ){
                s = s.replace(s.charAt(i), (char)(((int) letter) + 32));
            }
        }
        return s;
    }
}
