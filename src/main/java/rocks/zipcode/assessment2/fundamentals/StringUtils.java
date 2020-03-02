package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%"+ amountOfPadding+"s",stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-"+ amountOfPadding+"s",stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            result.append(stringToBeRepeated);
        }
        String newResult = String.valueOf(result);

        return newResult;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String[] splitString = string.split(" ");
        String tempString = "";
        boolean result = true;
        for (String s : splitString) {
            tempString += s;
        }
        for (int i = 0; i < tempString.length(); i++) {
            Character temp = tempString.charAt(i);
            if(!Character.isAlphabetic(tempString.charAt(i))){
                result =  false;
                break;
            }
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if (string.matches("[0-9]+") && string.length() > 2) {
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String splChrs = "!@#$%^&*()_+" ;
        if(string.matches("[" + splChrs + "]+")){
            return true;
        }
        return false;
    }
}
