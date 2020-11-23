package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int hop = endingIndex - startingIndex;
        String[] tempArray;
        if (hop > 0) {
            tempArray = new String[hop];
        } else {
            throw new java.lang.IllegalArgumentException();

        }

        //  if(hop > 0) {
        int j = 0;
        for (int i = startingIndex; i < endingIndex; i++) {
            tempArray[j] = arrayToBeSpliced[i];
            j++;
        }
        return tempArray;
    //}
//       else
//           return tempArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int hop=arrayToBeSpliced.length-startingIndex;
        String[] tempArray;
        if (hop > 0) {
            tempArray = new String[hop];
        } else {
            throw new java.lang.IllegalArgumentException();

        }
          tempArray = new String[hop];
        if(hop > 0) {
            int j = 0;
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                tempArray[j] = arrayToBeSpliced[i];
                j++;
            }
            return tempArray;
        }
        else
            return tempArray;
    }
}
