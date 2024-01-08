/** String processing exercise 2. */
public class uniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        int[] usedLetters = new int[1000];
        String newWord = "";
        for(int i = 0; i < s.length(); i++){
            Character letter =  s.charAt(i);
            if((usedLetters[(int) letter] != 1) || ((int) letter == 32)){
                newWord = newWord + s.charAt(i);
                usedLetters[(int) letter] = 1;
            }
        }
        return newWord;
    }
}
