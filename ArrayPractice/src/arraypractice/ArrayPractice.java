/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

/**
 *
 * @author James
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    static public void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    static public void QuickSort(int[] array,int low,int high) {
        if (low < high) {
            int pi = partition(array,low,high);
            QuickSort(array,low,pi-1);
            QuickSort(array,pi+1,high);
        }
    }
    
    static public int partition(int[] array,int low,int high) {
        int pivot = array[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        
        return (i+1);
    }
    
    static public void BubbleSort(int[] array) {
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
    
    static public int[] Duplicate(int[] array) {
        int[] duplicateArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]) {
                duplicateArray[count] = array[i];
                count++;
            }
        }
        return duplicateArray;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {10,6,24,18,23,16,6,5,3,5,3};
        PrintArray(array);
        //QuickSort(array,0,array.length-1);
        BubbleSort(array);
        System.out.println("");
        PrintArray(array);
        System.out.println("");
        int[] test = Duplicate(array);
        for (int i = 0; i < test.length; i++) {
            if (test[i] != 0) {
                System.out.print(test[i] + " ");
        
            }
        }
        System.out.println("");
    }
    
}
 