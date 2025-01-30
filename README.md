
# AlgoPerformanceTest

This lab focuses on implementing and comparing various sorting and searching algorithms. The primary algorithms implemented include:

* **Binary Search***: A fast search algorithm that works on sorted arrays.

* **Insertion Sort**: A simple sorting algorithm that builds the final sorted array one item at a time.

* **QuickSort**: A highly efficient sorting algorithm that uses a divide-and-conquer approach. Both recursive and iterative versions are implemented, with different pivot selection strategies.

The lab also includes a performance comparison of these algorithms on arrays of varying sizes. Mainly on an arry of 1,000,000.

### Files:

* **BinarySearch.java**: Contains the implementation of the binary search algorithm.

* **InsertionSort.java**: Contains both iterative and recursive implementations of the insertion sort algorithm.

* **QuickSortRecursive.java**: Contains recursive implementations of QuickSort with different pivot selection strategies (first element, random element, and middle element).

* **QuickSortIterative.java**: Contains iterative implementations of QuickSort with different pivot selection strategies (first element, random element, and middle element).

* **Main.java**: The main driver program that reads data from a file, runs the sorting and searching algorithms, and measures their performance.

### Performance Comparison

The **Main.java** file contains code to measure the performance of the sorting and searching algorithms on arrays of different sizes (10, 100, 1000, 10000, 100000, and 1000000 elements). The performance is measured in terms of the average time taken to sort or search the array over multiple runs.

### Metrics
* **Average Time**: The average time taken by each algorithm to sort or search the array over 10 runs.

* **Array Sizes**: The algorithms are tested on arrays of sizes 10, 100, 1000, 10000, 100000, and 1000000 elements.

## How to Run

1. **Compile the Code**: Use the following command to compile all the Java files: ```javac *.java```

2. **Run the Main Program**: Use the following command to run the main program: ```java Main```

3. **Output**: The program will output the average time taken by each algorithm for different array sizes.

## Results
The program will print the average time taken by each algorithm for different array sizes. The results will help in understanding the performance characteristics of each algorithm and how they scale with the size of the input data.
