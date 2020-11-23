package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {


        return String.format("%" + (amountOfPadding) + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + "-" + (amountOfPadding) + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            sb.append(stringToBeRepeated);
        }

        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

//        Boolean result = ((!string.equals(""))
//                && (string != null)
//                && (string.matches("^[a-zA-Z]*$")));;
//        return result;
        if (string == null) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && c != ' ') {
                return false;
            }
        }
        return true;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        if (string == null) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c >= '0' && c <= '9') && c != ' ') {
                return false;
            }
        }
        return true;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if (isNumericString(string) || isAlphaString(string)){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) > 47 && string.charAt(i) < 58){
                return false;
            }
            else if (string.charAt(i) >64 && string.charAt(i) <91){
                return false;
            }
            else if (string.charAt(i) > 96 && string.charAt(i) < 123){
                return false;
            }
        }
        return true;
    }

}
