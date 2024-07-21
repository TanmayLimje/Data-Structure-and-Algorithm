package sort;

import java.util.Arrays;

public class Sort {
    public static void BubbleSort(int[] array){
        for (int i =  array.length - 1; i > 0 ; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] array){
        for(int i = 0; i < array.length ; i++){
            int minIndex = i;
            for(int j = i+1; j < array.length ; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void InsertionSort(int [] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;
            while (j > -1 && temp < array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static int[] merge(int[] array1, int[] array2){
        int [] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                combined[index] = array1[i];
                index++;
                i++;
            } else{
                combined[index] = array2[j];
                j++;
                index++;
            }
        }

        while (i < array1.length){
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length){
            combined[index] = array2[j];
            index++;
            j++;
        }

        return combined;
    }

    public static int[] MergeSort(int[] array){
        if(array.length == 1) return array;

        int midIndex = array.length / 2;
        int[] left  = MergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = MergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left,right);
    }

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex+1; i <= endIndex; i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,pivotIndex,swapIndex);

        return swapIndex;
    }

    public static void QuickSortHelper(int[] array, int left, int right){
        if(left < right){
            int pivotIndex = pivot(array,left,right);
            QuickSortHelper(array,left,pivotIndex-1);
            QuickSortHelper(array,pivotIndex+1,right);
        }
    }

    public static void QuickSort(int[] array){
        QuickSortHelper(array,0, array.length-1);
    }

    public static void main(String[] arg){
        int [] arrayB = {4,2,6,5,1,3};
        int [] arrayS = {4,2,6,5,1,3};
        int [] arrayI = {4,2,6,5,1,3};
        int [] arrayQ = {4,6,1,7,3,2,5};
        System.out.println("\nUnsorted Array: " + Arrays.toString(arrayB));

        //BubbleSort(arrayB);
        System.out.println("\nBubble Sort: " + Arrays.toString(arrayB));

        SelectionSort(arrayS);
        System.out.println("Selection Sort: " + Arrays.toString(arrayS));

        InsertionSort(arrayI);
        System.out.println("Insertion Sort: " + Arrays.toString(arrayI));

       // System.out.println(Arrays.toString( merge(arrayB,arrayI)));

        int[] sortedM = MergeSort(arrayB);
        System.out.println("Merge Sort: " + Arrays.toString((sortedM)));

//        int returnedIndex = pivot(arrayB,0,5);
//        System.out.println("R index = " + returnedIndex);
//        System.out.println(Arrays.toString(arrayB));

        QuickSort(arrayQ);
        System.out.println("Quick Sort: " + Arrays.toString(arrayQ));
    }
}
