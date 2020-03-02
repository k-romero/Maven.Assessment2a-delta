package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String result = "";
        for (int i = string1.length()-1; i >= 0; i--) {
            result += string1.charAt(i);
        }
        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String combinedString = concatentate(string2,string1);
        return reverse(combinedString);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String result = "";

        Character[] charsToRemove = new Character[charactersToRemove.length()];
        ArrayList<String> remove = new ArrayList<>();
        for (int i = 0; i < charsToRemove.length; i++) {
            String temp = "";
            temp += charactersToRemove.charAt(i);
            remove.add(temp);
            temp = "";
        }
        for (int i = 0; i < string.length(); i++) {
            String temp = "";
            temp += string.charAt(i);
            if(!remove.contains(temp)){
                result += temp;
            }
            temp = "";
        }
        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String result = removeCharacters(string,charactersToRemove);



        return reverse(result);
    }
}
