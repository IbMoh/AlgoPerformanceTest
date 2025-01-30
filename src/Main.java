import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/Seminar 1 - File with random numbers.txt");
        Scanner scan = new Scanner(file);
        int[] numbers = new int[1000000];
        int index = 0;
        int runTime = 10;

        // Check if there is another integer to read
        while (scan.hasNextInt() && index < numbers.length) {
            numbers[index++] = scan.nextInt();
        }

        QuickSortRecursive q = new QuickSortRecursive();
        InsertionSort i = new InsertionSort();
        BinarySearch b = new BinarySearch();
        QuickSortIterative qq = new QuickSortIterative();

        double totalTimeFirstPivotRc10e = 0;
        double totalTimeFirstPivotRc100e = 0;
        double totalTimeFirstPivotRc1000e = 0;
        double totalTimeFirstPivotRc10000e = 0;
        double totalTimeFirstPivotRc100000e = 0;
        double totalTimeFirstPivotRc1000000e = 0;
        //---------------------------------------
        double totalTimeRandomPivot100 = 0;
        double totalTimeRandomPivot1000 = 0;
        double totalTimeRandomPivot10000 = 0;
        double totalTimeRandomPivot100000 = 0;
        double totalTimeRandomPivot1000000 = 0;
        //----------------------------------------
        double totalTimeMO3Rc100 = 0;
        double totalTimeMO3Rc1000 = 0;
        double totalTimeMO3Rc10000 = 0;
        double totalTimeMO3Rc100000 = 0;
        double totalTimeMO3Rc1000000 = 0;
        //----------------------------------------
        double totalTimeInsertRc100 = 0;
        double totalTimeInsertRc1000 = 0;
        double totalTimeInsertRc10000 = 0;
        double totalTimeInsertRc100000 = 0;
        double totalTimeInsertRc1000000 = 0;
        //-----------------------------------------
        double totalTimeInsertIt100 = 0;
        double totalTimeInsertIt1000 = 0;
        double totalTimeInsertIt10000 = 0;
        double totalTimeInsertIt100000 = 0;
        double totalTimeInsertIt1000000 = 0;
        //-----------------------------------------
        double totalTimeMO3It100 = 0;
        double totalTimeMO3It1000 = 0;
        double totalTimeMO3It10000 = 0;
        double totalTimeMO3It100000 = 0;
        double totalTimeMO3It1000000 = 0;
        //-----------------------------------------
        double totalTimeRandomIt100 = 0;
        double totalTimeRandomIt1000 = 0;
        double totalTimeRandomIt10000 = 0;
        double totalTimeRandomIt100000 = 0;
        double totalTimeRandomIt1000000 = 0;
        //-----------------------------------------
        double totalTimeFirstEleIT100 = 0;
        double totalTimeFirstEleIT1000 = 0;
        double totalTimeFirstEleIT10000 = 0;
        double totalTimeFirstEleIT100000 = 0;
        double totalTimeFirstEleIT1000000 = 0;
        //-----------------------------------------
        double totalTimeBSearch100 = 0;
        double totalTimeBSearch1000 = 0;
        double totalTimeBSearch10000 = 0;
        double totalTimeBSearch100000 = 0;
        double totalTimeBSearch1000000 = 0;



        for(int t = 0; t < runTime; t++){

            int[] quicksortFirstPivotRc10e = new int[10];
            double startTimeFP10e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc10e,10);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc10e, 0 ,
                        quicksortFirstPivotRc10e.length - 1);
            }

            double endTime10e = System.currentTimeMillis();
            totalTimeFirstPivotRc10e += endTime10e - startTimeFP10e;


            double startTimeFP100e = System.currentTimeMillis();
            int[]quicksortFirstPivotRc100e = new int[100];
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc100e,100);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc100e, 0 ,
                        quicksortFirstPivotRc100e.length - 1);
            }

            double endTimeFP100e = System.currentTimeMillis();
            totalTimeFirstPivotRc100e += endTimeFP100e - startTimeFP100e;


            int[] quicksortFirstPivotRc1000e = new int[1000];
            double startTimeFP1000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc1000e,1000);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc1000e, 0 ,
                        quicksortFirstPivotRc1000e.length - 1);
            }

            double endTimeFP1000e = System.currentTimeMillis();
            totalTimeFirstPivotRc1000e += endTimeFP1000e - startTimeFP1000e;


            int[] quicksortFirstPivotRc10000e = new int[10000];
            double startTimeFP10000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc10000e,10000);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc10000e, 0 ,
                        quicksortFirstPivotRc10000e.length - 1);
            }

            double endTimeFP10000e = System.currentTimeMillis();
            totalTimeFirstPivotRc10000e += endTimeFP10000e - startTimeFP10000e;


            int[] quicksortFirstPivotRc100000e = new int[100000];
            double startTimeFP100000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc100000e,100000);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc100000e, 0 ,
                        quicksortFirstPivotRc100000e.length - 1);
            }

            double endTimeFP100000e = System.currentTimeMillis();
            totalTimeFirstPivotRc100000e += endTimeFP100000e - startTimeFP100000e;

            int[] quicksortFirstPivotRc1000000e = new int[1000000];
            double startTimeFP1000000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotRc1000000e,1000000);
                q.quickSortFirstElementRecursive(quicksortFirstPivotRc1000000e, 0 ,
                        quicksortFirstPivotRc1000000e.length - 1);
            }

            double endTimeFP1000000e = System.currentTimeMillis();
            totalTimeFirstPivotRc1000000e += endTimeFP1000000e - startTimeFP1000000e;

            //------------------------------------------------------------------------

            int[] quicksortRandomRc100e = new int[100];
            double startTimeRP100e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomRc100e,100);
                q.quickSortRandomPivotRecursive(quicksortRandomRc100e, 0 ,
                        quicksortRandomRc100e.length - 1);
            }

            double endTimeRP100e = System.currentTimeMillis();
            totalTimeRandomPivot100 += endTimeRP100e - startTimeRP100e;

            int[] quicksortRandomRc1000e = new int[1000];
            double startTimeRP1000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomRc1000e,1000);
                q.quickSortRandomPivotRecursive(quicksortRandomRc1000e, 0 ,
                        quicksortRandomRc1000e.length - 1);
            }

            double endTimeRP1000e = System.currentTimeMillis();
            totalTimeRandomPivot1000 += endTimeRP1000e - startTimeRP1000e;


            int[] quicksortRandomRc10000e = new int[10000];
            double startTimeRP10000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomRc10000e,10000);
                q.quickSortRandomPivotRecursive(quicksortRandomRc10000e, 0 ,
                        quicksortRandomRc10000e.length - 1);
            }

            double endTimeRP10000e = System.currentTimeMillis();
            totalTimeRandomPivot10000 += endTimeRP10000e - startTimeRP10000e;


            int[] quicksortRandomRc100000e = new int[100000];
            double startTimeRP100000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomRc100000e,100000);
                q.quickSortRandomPivotRecursive(quicksortRandomRc100000e, 0 ,
                        quicksortRandomRc100000e.length - 1);
            }

            double endTimeRP100000e = System.currentTimeMillis();
            totalTimeRandomPivot100000 += endTimeRP100000e - startTimeRP100000e;


            int[] quicksortRandomRc1000000e = new int[1000000];
            double startTimeRP1000000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomRc1000000e,1000000);
                q.quickSortRandomPivotRecursive(quicksortRandomRc1000000e, 0 ,
                        quicksortRandomRc1000000e.length - 1);
            }

            double endTimeRP1000000e = System.currentTimeMillis();
            totalTimeRandomPivot1000000 += endTimeRP1000000e - startTimeRP1000000e;

            //-------------------------------------------------------------------------
            int[] quicksortMO3Rc100e = new int[100];
            double startTimeMO3100e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3Rc100e,100);
                q.quickSortMidRc(quicksortMO3Rc100e, 0 ,
                        quicksortMO3Rc100e.length - 1);
            }
            double endTimeMO3100e = System.currentTimeMillis();
            totalTimeMO3Rc100 += endTimeMO3100e - startTimeMO3100e;


            int[] quicksortMO3Rc1000e = new int[1000];
            double startTimeMO31000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3Rc1000e,1000);
                q.quickSortMidRc(quicksortMO3Rc1000e, 0 ,
                        quicksortMO3Rc1000e.length - 1);
            }
            double endTimeMO31000e = System.currentTimeMillis();
            totalTimeMO3Rc1000 += endTimeMO31000e - startTimeMO31000e;


            int[] quicksortMO3Rc10000e = new int[10000];
            double startTimeMO310000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3Rc10000e,10000);
                q.quickSortMidRc(quicksortMO3Rc10000e, 0 ,
                        quicksortMO3Rc10000e.length - 1);
            }
            double endTimeMO310000e = System.currentTimeMillis();
            totalTimeMO3Rc10000 += endTimeMO310000e - startTimeMO310000e;


            int[] quicksortMO3Rc100000e = new int[100000];
            double startTimeMO3100000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3Rc100000e,100000);
                q.quickSortMidRc(quicksortMO3Rc100000e, 0 ,
                        quicksortMO3Rc100000e.length - 1);
            }
            double endTimeMO3100000e = System.currentTimeMillis();
            totalTimeMO3Rc100000 += endTimeMO3100000e - startTimeMO3100000e;


            int[] quicksortMO3Rc1000000e = new int[1000000];
            double startTimeMO31000000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3Rc1000000e,1000000);
                q.quickSortMidRc(quicksortMO3Rc1000000e, 0 ,
                        quicksortMO3Rc1000000e.length - 1);
            }
            double endTimeMO31000000e = System.currentTimeMillis();
            totalTimeMO3Rc1000000 += endTimeMO31000000e - startTimeMO31000000e;
            //------------------------------------------------------------------
            int[] InsertionRc100e = new int[100];
            double startTimeInRc100e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionRc100e,100);
                i.insertionSortRec(InsertionRc100e,InsertionRc100e.length);
            }
            double endTimeInRc100e = System.currentTimeMillis();
            totalTimeInsertRc100 += endTimeInRc100e - startTimeInRc100e;


            int[] InsertionRc1000e = new int[1000];
            double startTimeInRc1000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionRc1000e,1000);
                i.insertionSortRec(InsertionRc1000e,InsertionRc1000e.length);
            }
            double endTimeInRc1000e = System.currentTimeMillis();
            totalTimeInsertRc1000 += endTimeInRc1000e - startTimeInRc1000e;


            int[] InsertionRc10000e = new int[10000];
            double startTimeInRc10000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionRc10000e,10000);
                i.insertionSortRec(InsertionRc10000e,InsertionRc10000e.length);
            }
            double endTimeInRc10000e = System.currentTimeMillis();
            totalTimeInsertRc10000 += endTimeInRc10000e - startTimeInRc10000e;


            int[] InsertionRc100000e = new int[100000];
            double startTimeInRc100000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionRc100000e,100000);
                i.insertionSortRec(InsertionRc100000e,InsertionRc100000e.length);
            }
            double endTimeInRc100000e = System.currentTimeMillis();
            totalTimeInsertRc100000 += endTimeInRc100000e - startTimeInRc100000e;


            int[] InsertionRc1000000e = new int[1000000];
            double startTimeInRc1000000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionRc1000000e,1000000);
                i.insertionSortRec(InsertionRc1000000e,InsertionRc1000000e.length);
            }
            double endTimeInRc1000000e = System.currentTimeMillis();
            totalTimeInsertRc1000000 += endTimeInRc1000000e - startTimeInRc1000000e;

           //------------------------------------------------------------------------

            int[] InsertionIt100e = new int[100];
            double startTimeInIt100e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionIt100e,100);
                i.insertionSortIt(InsertionIt100e);
            }
            double endTimeInIt100e = System.currentTimeMillis();
            totalTimeInsertIt100 += endTimeInIt100e - startTimeInIt100e;

            int[] InsertionIt1000e = new int[1000];
            double startTimeInIt1000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionIt1000e,1000);
                i.insertionSortIt(InsertionIt1000e);
            }
            double endTimeInIt1000e = System.currentTimeMillis();
            totalTimeInsertIt1000 += endTimeInIt1000e - startTimeInIt1000e;

            int[] InsertionIt10000e = new int[10000];
            double startTimeInIt10000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionIt10000e,10000);
                i.insertionSortIt(InsertionIt10000e);
            }
            double endTimeInIt10000e = System.currentTimeMillis();
            totalTimeInsertIt10000 += endTimeInIt10000e - startTimeInIt10000e;

            int[] InsertionIt100000e = new int[100000];
            double startTimeInIt100000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionIt100000e,100000);
                i.insertionSortIt(InsertionIt100000e);
            }
            double endTimeInIt100000e = System.currentTimeMillis();
            totalTimeInsertIt100000 += endTimeInIt100000e - startTimeInIt100000e;

            int[] InsertionIt1000000e = new int[1000000];
            double startTimeInIt1000000e = System.currentTimeMillis();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,InsertionIt1000000e,1000000);
                i.insertionSortIt(InsertionIt1000000e);
            }
            double endTimeInIt1000000e = System.currentTimeMillis();
            totalTimeInsertIt1000000 += endTimeInIt1000000e - startTimeInIt1000000e;
            //-------------------------------------------------------------------------

            int[] quicksortFirstPivotIt100e = new int[100];
            double startTimeFPIt100e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotIt100e,100);
                qq.quickSortIterativeFirst(quicksortFirstPivotIt100e);
            }

            double endTimeFPIt100e = System.currentTimeMillis();
            totalTimeFirstEleIT100 += endTimeFPIt100e - startTimeFPIt100e;

            int[] quicksortFirstPivotIt1000e = new int[1000];
            double startTimeFPIt1000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotIt1000e,1000);
                qq.quickSortIterativeFirst(quicksortFirstPivotIt1000e);
            }

            double endTimeFPIt1000e = System.currentTimeMillis();
            totalTimeFirstEleIT1000 += endTimeFPIt1000e - startTimeFPIt1000e;

            int[] quicksortFirstPivotIt10000e = new int[10000];
            double startTimeFPIt10000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotIt10000e,10000);
                qq.quickSortIterativeFirst(quicksortFirstPivotIt10000e);
            }

            double endTimeFPIt10000e = System.currentTimeMillis();
            totalTimeFirstEleIT10000 += endTimeFPIt10000e - startTimeFPIt10000e;

            int[] quicksortFirstPivotIt100000e = new int[100000];
            double startTimeFPIt100000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotIt100000e,100000);
                qq.quickSortIterativeFirst(quicksortFirstPivotIt100000e);
            }

            double endTimeFPIt100000e = System.currentTimeMillis();
            totalTimeFirstEleIT100000 += endTimeFPIt100000e - startTimeFPIt100000e;


            int[] quicksortFirstPivotIt1000000e = new int[1000000];
            double startTimeFPIt1000000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortFirstPivotIt1000000e,1000000);
                qq.quickSortIterativeFirst(quicksortFirstPivotIt1000000e);
            }

            double endTimeFPIt1000000e = System.currentTimeMillis();
            totalTimeFirstEleIT1000000 += endTimeFPIt1000000e - startTimeFPIt1000000e;

            //------------------------------------------------------------------------
            int[] quicksortRandomIt100e = new int[100];
            double startTimeRandIt100e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomIt100e,100);
                qq.quickSortIterativeRandom(quicksortRandomIt100e);
            }
            double endTimeRandIt100e = System.currentTimeMillis();
            totalTimeRandomIt100 += endTimeRandIt100e - startTimeRandIt100e;

            int[] quicksortRandomIt1000e = new int[1000];
            double startTimeRandIt1000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomIt1000e,1000);
                qq.quickSortIterativeRandom(quicksortRandomIt1000e);
            }
            double endTimeRandIt1000e = System.currentTimeMillis();
            totalTimeRandomIt1000 += endTimeRandIt1000e - startTimeRandIt1000e;

            int[] quicksortRandomIt10000e = new int[10000];
            double startTimeRandIt10000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomIt10000e,10000);
                qq.quickSortIterativeRandom(quicksortRandomIt10000e);
            }
            double endTimeRandIt10000e = System.currentTimeMillis();
            totalTimeRandomIt10000 += endTimeRandIt10000e - startTimeRandIt10000e;


            int[] quicksortRandomIt100000e = new int[100000];
            double startTimeRandIt100000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomIt100000e,100000);
                qq.quickSortIterativeRandom(quicksortRandomIt100000e);
            }
            double endTimeRandIt100000e = System.currentTimeMillis();
            totalTimeRandomIt100000 += endTimeRandIt100000e - startTimeRandIt100000e;


            int[] quicksortRandomIt1000000e = new int[1000000];
            double startTimeRandIt1000000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortRandomIt1000000e,1000000);
                qq.quickSortIterativeRandom(quicksortRandomIt1000000e);
            }
            double endTimeRandIt1000000e = System.currentTimeMillis();
            totalTimeRandomIt1000000 += endTimeRandIt1000000e - startTimeRandIt1000000e;

            //--------------------------------------------------------------------------
            int[] quicksortMO3It100e = new int[100];
            double startTimeMO3It100e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3It100e,100);
                qq.quickSortIterativeMidIt(quicksortMO3It100e);
            }
            double endTimeMO3It100e = System.currentTimeMillis();
            totalTimeMO3It100 += endTimeMO3It100e - startTimeMO3It100e;


            int[] quicksortMO3It1000e = new int[1000];
            double startTimeMO3It1000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3It1000e,1000);
                qq.quickSortIterativeMidIt(quicksortMO3It1000e);
            }
            double endTimeMO3It1000e = System.currentTimeMillis();
            totalTimeMO3It1000 += endTimeMO3It1000e - startTimeMO3It1000e;


            int[] quicksortMO3It10000e = new int[10000];
            double startTimeMO3It10000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3It10000e,10000);
                qq.quickSortIterativeMidIt(quicksortMO3It10000e);
            }
            double endTimeMO3It10000e = System.currentTimeMillis();
            totalTimeMO3It10000 += endTimeMO3It10000e - startTimeMO3It10000e;


            int[] quicksortMO3It100000e = new int[100000];
            double startTimeMO3It100000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3It100000e,100000);
                qq.quickSortIterativeMidIt(quicksortMO3It100000e);
            }
            double endTimeMO3It100000e = System.currentTimeMillis();
            totalTimeMO3It100000 += endTimeMO3It100000e - startTimeMO3It100000e;


            int[] quicksortMO3It1000000e = new int[1000000];
            double startTimeMO3It1000000e = System.currentTimeMillis();

            for(int x = 0; x < runTime; x++){
                addElements(numbers,quicksortMO3It1000000e,1000000);
                qq.quickSortIterativeMidIt(quicksortMO3It1000000e);
            }
            double endTimeMO3It1000000e = System.currentTimeMillis();
            totalTimeMO3It1000000 += endTimeMO3It1000000e - startTimeMO3It1000000e;
            //---------------------------------------------------------------------

            int[] binarySearch100 = new int[100];
            addElements(numbers,binarySearch100,100);
            q.quickSortMidRc(binarySearch100,0,binarySearch100.length - 1);
            double startTimeBSearch100e = System.nanoTime();
            for(int x = 0; x < runTime; x++){
                b.binarySearch(binarySearch100, 0, binarySearch100.length -1, 42);
            }
            double endTimeBSearch100e = System.nanoTime();
            totalTimeBSearch100 += endTimeBSearch100e - startTimeBSearch100e;


            int[] binarySearch1000 = new int[1000];
            addElements(numbers,binarySearch1000,1000);
            q.quickSortMidRc(binarySearch1000,0,binarySearch100.length - 1);
            double startTimeBSearch1000e = System.nanoTime();
            for(int x = 0; x < runTime; x++){
                b.binarySearch(binarySearch1000, 0, binarySearch1000.length -1, 42);
            }
            double endTimeBSearch1000e = System.nanoTime();
            totalTimeBSearch1000 += endTimeBSearch1000e - startTimeBSearch1000e;


            int[] binarySearch10000 = new int[10000];
            addElements(numbers,binarySearch10000,10000);
            q.quickSortMidRc(binarySearch10000,0,binarySearch10000.length - 1);
            double startTimeBSearch10000e = System.nanoTime();
            for(int x = 0; x < runTime; x++){
                b.binarySearch(binarySearch10000, 0, binarySearch10000.length -1, 42);
            }
            double endTimeBSearch10000e = System.nanoTime();
            totalTimeBSearch10000 += endTimeBSearch10000e - startTimeBSearch10000e;


            int[] binarySearch100000 = new int[100000];
            addElements(numbers,binarySearch100000,100000);
            q.quickSortMidRc(binarySearch100000,0,binarySearch100000.length - 1);
            double startTimeBSearch100000e = System.nanoTime();
            for(int x = 0; x < runTime; x++){
                b.binarySearch(binarySearch100000, 0, binarySearch100000.length -1, 42);
            }
            double endTimeBSearch100000e = System.nanoTime();
            totalTimeBSearch100000 += endTimeBSearch100000e - startTimeBSearch100000e;

            int[] binarySearch1000000 = new int[1000000];
            addElements(numbers,binarySearch1000000,1000000);
            q.quickSortMidRc(binarySearch1000000,0,binarySearch1000000.length - 1);
            double startTimeBSearch1000000e = System.nanoTime();
            for(int x = 0; x < runTime; x++){
                addElements(numbers,binarySearch1000000,1000000);
                b.binarySearch(binarySearch1000000, 0, binarySearch1000000.length -1, 42);
            }
            double endTimeBSearch1000000e = System.nanoTime();
            totalTimeBSearch1000000 += endTimeBSearch1000000e - startTimeBSearch1000000e;



        }
        //------------------------------------------------------------------------------

        double averageTimeFirstPivotRc10e = totalTimeFirstPivotRc10e / (double) runTime;
        double averageTimeFirstPivotRc100e = totalTimeFirstPivotRc100e / (double) runTime;
        double avgTimeFirstPivotRc1000e = totalTimeFirstPivotRc1000e / (double) runTime;
        double avgTimeFPRc10000e = totalTimeFirstPivotRc10000e / (double) runTime;
        double avgTimeFPrc100000e = totalTimeFirstPivotRc100000e / (double) runTime;
        double avgTimeFPRc1000000 = totalTimeFirstPivotRc1000000e / (double) runTime;
        //-----------------------------------------------------------------------------

        double avgTimeRPRc100 = totalTimeRandomPivot100 / (double) runTime;
        double avgTimeRPRc1000 = totalTimeRandomPivot1000 / (double) runTime;
        double avgTimeRPRc10000 = totalTimeRandomPivot10000 / (double) runTime;
        double avgTimeRPRc100000 = totalTimeRandomPivot100000 / (double) runTime;
        double avgTimeRPRc1000000 = totalTimeRandomPivot1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeMO3100 = totalTimeMO3Rc100 / (double) runTime;
        double avgTimeMO31000 = totalTimeMO3Rc1000 / (double) runTime;
        double avgTimeMO310000 = totalTimeMO3Rc10000 / (double) runTime;
        double avgTimeMO3100000 = totalTimeMO3Rc100000 / (double) runTime;
        double avgTimeMO31000000 = totalTimeMO3Rc1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeInsertRc100 = totalTimeInsertRc100 / (double) runTime;
        double avgTimeInsertRc1000 = totalTimeInsertRc1000 / (double) runTime;
        double avgTimeInsertRc10000 = totalTimeInsertRc10000 / (double) runTime;
        double avgTimeInsertRc100000 = totalTimeInsertRc100000 / (double) runTime;
        double avgTimeInsertRc1000000 = totalTimeInsertRc1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeInsertIt100 = totalTimeInsertIt100 / (double) runTime;
        double avgTimeInsertIt1000 = totalTimeInsertIt1000 / (double) runTime;
        double avgTimeInsertIt10000 = totalTimeInsertIt10000 / (double) runTime;
        double avgTimeInsertIt100000 = totalTimeInsertIt100000 / (double) runTime;
        double avgTimeInsertIt1000000 = totalTimeInsertIt1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeFPIt100 = totalTimeFirstEleIT100 / (double) runTime;
        double avgTimeFPIt1000 = totalTimeFirstEleIT1000 / (double) runTime;
        double avgTimeFPIt10000 = totalTimeFirstEleIT10000 / (double) runTime;
        double avgTimeFPIt100000 = totalTimeFirstEleIT10000 / (double) runTime;
        double avgTimeFPIt1000000 = totalTimeFirstEleIT100000 / (double) runTime;
        double avgTimeFPIt10000000 = totalTimeFirstEleIT1000000 / (double) runTime;
        //-----------------------------------------------------------------------------

        double avgTimeRandIt100 = totalTimeRandomIt100 / (double) runTime;
        double avgTimeRandIt1000 = totalTimeRandomIt1000 / (double) runTime;
        double avgTimeRandIt10000 = totalTimeRandomIt10000 / (double) runTime;
        double avgTimeRandIt100000 = totalTimeRandomIt100000 / (double) runTime;
        double avgTimeRandIt1000000 = totalTimeRandomIt1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeMO3IT100 = totalTimeMO3It100 / (double) runTime;
        double avgTimeMO3IT1000 = totalTimeMO3It1000 / (double) runTime;
        double avgTimeMO3IT10000 = totalTimeMO3It10000 / (double) runTime;
        double avgTimeMO3IT100000 = totalTimeMO3It100000 / (double) runTime;
        double avgTimeMO3IT1000000 = totalTimeMO3It1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        double avgTimeBSearch100 = totalTimeBSearch100 / (double) runTime;
        double avgTimeBSearch1000 = totalTimeBSearch1000 / (double) runTime;
        double avgTimeBSearch10000 = totalTimeBSearch10000 / (double) runTime;
        double avgTimeBSearch100000 = totalTimeBSearch100000 / (double) runTime;
        double avgTimeBSearch1000000 = totalTimeBSearch1000000 / (double) runTime;

        //-----------------------------------------------------------------------------

        System.out.println("quickSort First Pivot Recursive Times: ");
        System.out.println("Average time for quicksortFirstPivotRc10e: " + averageTimeFirstPivotRc10e + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotRc100e: " + averageTimeFirstPivotRc100e + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotRc1000e: " + avgTimeFirstPivotRc1000e + " milliseconds" );
        System.out.println("Average time for quicksortFirstPivotRc10000e: " + avgTimeFPRc10000e + " milliseconds" );
        System.out.println("Average time for quicksortFirstPivotRc100000e: " + avgTimeFPrc100000e + " milliseconds" );
        System.out.println("Average time for quicksortFirstPivotRc1000000e: " + avgTimeFPRc1000000 + " milliseconds" );
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("quickSort Random Pivot Recursive Times: ");
        System.out.println("Average time for quicksortRandomPRc100: " + avgTimeRPRc100 + " milliseconds");
        System.out.println("Average time for quicksortRandomPRc1000: " + avgTimeRPRc1000 + " milliseconds");
        System.out.println("Average time for quicksortRandomPRc10000: " + avgTimeRPRc10000 + " milliseconds");
        System.out.println("Average time for quicksortRandomPRc100000: " + avgTimeRPRc100000 + " milliseconds");
        System.out.println("Average time for quicksortRandomPRc1000000: " + avgTimeRPRc1000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("quickSort MO3 Recursive Times: ");
        System.out.println("Average time for quicksortMO3Rc100: " + avgTimeMO3100 + " milliseconds");
        System.out.println("Average time for quicksortMO3Rc1000: " + avgTimeMO31000 + " milliseconds");
        System.out.println("Average time for quicksortMO3Rc10000: " + avgTimeMO310000 + " milliseconds");
        System.out.println("Average time for quicksortMO3Rc100000: " + avgTimeMO3100000 + " milliseconds");
        System.out.println("Average time for quicksortMO3Rc1000000: " + avgTimeMO31000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Insertion sort Recursive Times: ");
        System.out.println("Average time for quicksortInsertionRc100: " + avgTimeInsertRc100 + " milliseconds");
        System.out.println("Average time for quicksortInsertionRc1000: " + avgTimeInsertRc1000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionRc10000: " + avgTimeInsertRc10000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionRc100000: " + avgTimeInsertRc100000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionRc1000000: " + avgTimeInsertRc1000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Insertion sort Iterative Times: ");
        System.out.println("Average time for quicksortInsertionIt100: " + avgTimeInsertIt100 + " milliseconds");
        System.out.println("Average time for quicksortInsertionIt1000: " + avgTimeInsertIt1000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionIt10000: " + avgTimeInsertIt10000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionIt100000: " + avgTimeInsertIt100000 + " milliseconds");
        System.out.println("Average time for quicksortInsertionIt1000000: " + avgTimeInsertIt1000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Average time for quicksortFirstPivotIt100e: " + avgTimeFPIt100 + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotIt1000e: " + avgTimeFPIt1000 + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotIt10000e: " + avgTimeFPIt10000 + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotIt100000e: " + avgTimeFPIt100000 + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotIt1000000e: " + avgTimeFPIt1000000 + " milliseconds");
        System.out.println("Average time for quicksortFirstPivotIt10000000e: " + avgTimeFPIt10000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------------------------------------

        System.out.println("Average time for quicksortRandIt100e: " + avgTimeRandIt100 + " milliseconds");
        System.out.println("Average time for quicksortRandIt1000e: " + avgTimeRandIt1000 + " milliseconds");
        System.out.println("Average time for quicksortRandIt10000e: " + avgTimeRandIt10000 + " milliseconds");
        System.out.println("Average time for quicksortRandIt100000e: " + avgTimeRandIt100000 + " milliseconds");
        System.out.println("Average time for quicksortRandIt1000000e: " + avgTimeRandIt1000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Average time for quicksortMO3It100e: " + avgTimeMO3IT100 + " milliseconds");
        System.out.println("Average time for quicksortMO3It1000e: " + avgTimeMO3IT1000 + " milliseconds");
        System.out.println("Average time for quicksortMO3It10000e: " + avgTimeMO3IT10000 + " milliseconds");
        System.out.println("Average time for quicksortMO3It100000e: " + avgTimeMO3IT100000 + " milliseconds");
        System.out.println("Average time for quicksortMO3It1000000e: " + avgTimeMO3IT1000000 + " milliseconds");
        System.out.println("------------------------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------------------------------

        System.out.println("Average time for quickBSearch100e: " + avgTimeBSearch100 + " milliseconds");
        System.out.println("Average time for quickBSearch1000e: " + avgTimeBSearch1000 + " milliseconds");
        System.out.println("Average time for quickBSearch10000e: " + avgTimeBSearch10000 + " milliseconds");
        System.out.println("Average time for quickBSearch100000e: " + avgTimeBSearch100000 + " milliseconds");
        System.out.println("Average time for quickBSearch1000000e: " + avgTimeBSearch1000000 + " milliseconds");

    }



    private static void addElements(int[] array1, int[] array2, int num){

        for (int i = 0; i < num; i++) {
            array2[i] = array1[i];
        }
    }

}