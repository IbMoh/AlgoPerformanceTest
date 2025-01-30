public class InsertionSort {

    void insertionSortIt(int[] inputArray){
        for(int i = 1; i < inputArray.length; i++ ){
            int currentValue = inputArray[i];

            int j = i - 1;

            while(j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    void insertionSortRec(int[] array, int n) {
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRec( array, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int last = array[n-1];
        int j = n-2;

        while (j >= 0 && array[j] > last) {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = last;
    }

}
