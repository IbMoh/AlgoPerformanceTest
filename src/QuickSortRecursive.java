import java.util.Random;

public class QuickSortRecursive {

    void quickSortRandomPivotRecursive(int[] array, int lowIndex, int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSortRandomPivotRecursive(array,lowIndex, leftPointer - 1);
        quickSortRandomPivotRecursive(array, leftPointer + 1, highIndex);

    }

    // Lomuto’s partition
    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

        }
        swap(array, leftPointer, highIndex);

        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2){

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    void quickSortFirstElementRecursive(int[] array, int low, int high)
    {

        if (low < high) {
            // index of pivot element which is at its sorted position
            int pivotIndex = partitionFirstElement(array, low, high);


            // Separately sort elements before
            quickSortFirstElementRecursive(array, low, pivotIndex - 1);
            quickSortFirstElementRecursive(array, pivotIndex + 1, high);
        }
    }
    private static int partitionFirstElement(int[] array, int low, int high) {
        // First element as pivot
        int pivot = array[low];
        int k = high;
        for (int i = high; i > low; i--) {
            if (array[i] > pivot)
                swap(array, i, k--);
        }
        swap(array, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    }

    // note we also use the first partition created
    void quickSortMidRc(int[] array, int lowIndex, int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSortMidRc(array,lowIndex, leftPointer - 1);
        quickSortMidRc(array, leftPointer + 1, highIndex);

    }


}
