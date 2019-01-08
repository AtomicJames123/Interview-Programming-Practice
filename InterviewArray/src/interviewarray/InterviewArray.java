/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewarray;

/**
 *
 * @author James
 */
public class InterviewArray {

    /**
     * @param args the command line arguments
     */
    static public void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array,low,high);
            QuickSort(array,pi+1,high);
            QuickSort(array,low,pi-1);
        }
    }
    
    static public int partition(int[] array,int low,int high) {
        int pivot = array[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        
        int temp = array[high];
        array[high] = array[i+1];
        array[i+1] = temp;
        
        return (i + 1);
    }
    
    static public void BubbleSort(int[] array,int low,int high) {
        boolean swapped = false;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    } // n best case, worst case is n^2
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {5,3,2,8,6};
        int[] array2 = {8,2,4,1,6};
        
        QuickSort(array,0,array.length-1); // best case: n, worst case n^2
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        BubbleSort(array2,0,array2.length-1);
        
        System.out.println();
        
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
    
}
