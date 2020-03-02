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
        int newArrLength = endingIndex-startingIndex;
        if(newArrLength > 0){
            String[] newArr = new String[newArrLength];
            for (int i = 0; i < newArrLength; i++) {
                newArr[i] = arrayToBeSpliced[startingIndex];
                startingIndex++;
            }
            return newArr;
        }
        else
        return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int newArrLength = arrayToBeSpliced.length - startingIndex;
        String[] newArr = new String[newArrLength];
        int counter = 0;
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            newArr[counter] = arrayToBeSpliced[startingIndex];
            counter++;
            startingIndex++;
        }

        return newArr;
    }
}
