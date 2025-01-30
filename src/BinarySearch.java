public class BinarySearch {

    boolean binarySearch(int[] array, int left, int right, int numToFind)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle
            if (array[mid] == numToFind)
                return true;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > numToFind)
                return binarySearch(array, left, mid - 1, numToFind);

            // Else the element is present in right of the subarray
            return binarySearch(array, mid + 1, right, numToFind);
        }

        // element is not present
        return false;
    }
}
