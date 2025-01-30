import java.util.Random;

public class QuickSortIterative {
    void quickSortIterativeMidIt(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        // Continue until the stack is empty
        while (top >= 0) {
            // Pop high and low
            high = stack[top--];
            low = stack[top--];

            // Partition the array and get the pivot index
            int pivotIndex = partitionMid(arr, low, high);

            // If there are elements on the left side of the pivot, push them to the stack
            if (pivotIndex - 1 > low) {
                stack[++top] = low;
                stack[++top] = pivotIndex - 1;
            }

            // If there are elements on the right side of the pivot, push them to the stack
            if (pivotIndex + 1 < high) {
                stack[++top] = pivotIndex + 1;
                stack[++top] = high;
            }
        }
    }

    private static int partitionMid(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        int pivot = arr[mid];

        // Move pivot to the end
        swap(arr, mid, high);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot to its final position
        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSortIterativeRandom(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        // Continue until the stack is empty
        while (top >= 0) {
            // Pop high and low
            high = stack[top--];
            low = stack[top--];

            // Choose a random pivot index between low and high (inclusive)
            Random rand = new Random();
            int pivotIndex = rand.nextInt(high - low + 1) + low;

            // Partition the array and get the pivot index
            pivotIndex = partition(arr, low, high, pivotIndex);

            // If there are elements on the left side of the pivot, push them to the stack
            if (pivotIndex - 1 > low) {
                stack[++top] = low;
                stack[++top] = pivotIndex - 1;
            }

            // If there are elements on the right side of the pivot, push them to the stack
            if (pivotIndex + 1 < high) {
                stack[++top] = pivotIndex + 1;
                stack[++top] = high;
            }
        }
    }



    private static int partition(int[] arr, int low, int high, int pivotIndex) {
        int pivot = arr[pivotIndex];

        // Move pivot to the end
        swap(arr, pivotIndex, high);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot to its final position
        swap(arr, i + 1, high);

        return i + 1;
    }

    void quickSortIterativeFirst(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        // Continue until the stack is empty
        while (top >= 0) {
            // Pop high and low
            high = stack[top--];
            low = stack[top--];

            // Choose the first element as the pivot
            int pivotIndex = low;

            // Partition the array and get the pivot index
            pivotIndex = partition(arr, low, high, pivotIndex);

            // If there are elements on the left side of the pivot, push them to the stack
            if (pivotIndex - 1 > low) {
                stack[++top] = low;
                stack[++top] = pivotIndex - 1;
            }

            // If there are elements on the right side of the pivot, push them to the stack
            if (pivotIndex + 1 < high) {
                stack[++top] = pivotIndex + 1;
                stack[++top] = high;
            }
        }
    }
}
