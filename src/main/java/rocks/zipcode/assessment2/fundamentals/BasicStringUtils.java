package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1.concat(string2);
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        char[] storeCharArray = string1.toCharArray();
        StringBuilder storeReverse= new StringBuilder();

        for (int i = storeCharArray.length - 1; i >= 0; i--)
            storeReverse.append(storeCharArray[i]);
        return storeReverse.toString();

    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        char[] storeCharArray1 = string1.toCharArray();
        StringBuilder storeReverse1= new StringBuilder();
        char[] storeCharArray2 = string2.toCharArray();
        StringBuilder storeReverse2= new StringBuilder();
        for (int i = storeCharArray1.length - 1; i >= 0; i--)
             storeReverse1.append(storeCharArray1[i]);

        for (int j = storeCharArray2.length - 1; j >= 0; j--)
            storeReverse2.append(storeCharArray2[j]);

        return storeReverse1.toString().concat(storeReverse2.toString());
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//        if(charactersToRemove.length() == 1)
//            string.replaceAll(String.valueOf(charactersToRemove), "");
//        else
//            if(charactersToRemove.length() > 1 )
        char[] storeCharArray1 = string.toCharArray();
        StringBuilder result= new StringBuilder();
        char[] storeCharArray2 = charactersToRemove.toCharArray();
        for(int i=0 ; i<storeCharArray2.length;i++)
        {
            for(int j=0;j<storeCharArray1.length;j++)
            {
                if(storeCharArray2[i] != storeCharArray1[j])
                {
                    result.append(storeCharArray1[j]);
                }
            }
            storeCharArray1=result.toString().toCharArray();

            result = new StringBuilder();
        }

  return String.valueOf(storeCharArray1);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String result=removeCharacters(string,charactersToRemove);
        String finalresult=reverse(result);

        return finalresult;
    }
}
