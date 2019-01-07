/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author James
 */
public class Interview {
    
    /**
     * @param args the command line arguments
     */
    static public int[] MergeSort(int[] array) {
       int temp;
       for (int i = 1; i < array.length; i++) {
           if (array[i] >= array[i-1]) {
               //temp = array[i+1];
               //array[i+1] = array[i];
               //array[i] = temp;
           }
           
           else {
               temp = array[i];
               array[i] = array[i-1];
               array[i-1] = temp;
           }
       }
       return array;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {10,14,22,53,8};
        array = MergeSort(array);
        String value = "aaaaaaaaa";
        int temp = value.length();
        int i = 0;
        //while (i < array.length) {
           // System.out.print(array[i] + ",");
           // i++;
        //}
        //Linear arrays, set size for the array
        //Dynamic arrays, have space for more variables
        //2d arrays, rows x columns, x and y values, like a graph, nested arrays
        // optimized seach is 0(logn) for both,
        //insertion for linear array n/a, dynamic array is 0(n)
        //indexing is 0(1) for both constant, normal search is 0(n)
        int[][] array2d = {{1,2},{3,4},{5,6}};
        
        
        
        
        
    }
    
}
