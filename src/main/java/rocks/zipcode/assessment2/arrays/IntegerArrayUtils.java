package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

    Integer[] tempArray= new Integer[integerArray.length+1];
    int currentIndex=0;
    for(int i=0; i< integerArray.length ;i++)
    {
        tempArray[i]=integerArray[i];
        currentIndex++;
    }
       tempArray[currentIndex] = valueToBeAdded;
        return tempArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] tempArray= new Integer[integerArray.length];
        for(int i=0; i< integerArray.length ;i++)
        {
            if(i==indexToInsertAt)
                tempArray[i]=valueToBeInserted;
            else
            tempArray[i]=integerArray[i];
         }
        return tempArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        for(int i=0; i< integerArray.length ;i++)
        {
            if(i==indexToFetch)
                return integerArray[i];
        }

        return 0;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer temp;
        for(int i=0; i< integerArray.length ;i++)
        {
            temp=integerArray[i];
            if(integerArray[i]%2==0)
                integerArray[i]=temp+1;
            else
            if(integerArray[i]%2!=0)
                integerArray[i]=temp-1;
       }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        Integer temp;
        for(int i=0; i< integerArray.length ;i++)
        {
            temp=integerArray[i];
            if(integerArray[i]%2==0)
                integerArray[i]=temp+1;

        }
        return integerArray;

    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer temp;
        for(int i=0; i< input.length ;i++)
        {
            temp=input[i];

            if(input[i]%2!=0)
                input[i]=temp-1;
        }
        return input;

    }
}
