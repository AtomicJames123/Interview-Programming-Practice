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
    static public void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array,low,high);
            QuickSort(array,pivot+1,high);
            QuickSort(array,low,pivot-1);
        }
    }
    static public int partition(int[] array, int low, int high) {
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
        
        //swap array[i+1 and high
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i+1);
    }
    
    static public void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] array = {10,14,22,53,8};
        //PrintArray(array);
        //int n = array.length - 1;
        //QuickSort(array,0,n);
        //System.out.println("");
        //PrintArray(array);
        //String value = "aaaaaaaaa";
        //int i = 0;
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
        //int[][] array2d = {{1,2},{3,4},{5,6}};
        
        //Stack stack = new Stack();
        //stack.push(2);
        //stack.push(4);
        //stack.push(10);
        //stack.push(15);
        //stack.push(100);
        //System.out.println(stack.top());
        //stack.pop();
        //System.out.println(stack.top());
        
       
        //for (int j = 0; j < 40; j++) {
            //stack.push(j);
        //}
        
        
        //LinkedList List = new LinkedList();
        //List.Insertion("Lambo");
        //List.Insertion("Lambo2");
        //List.Insertion("Lambo3");
        //System.out.println(List.size());
        //List.delete("Lambo2");
        //System.out.println(List.size());
        
         BinaryTree Tree = new BinaryTree();
         Tree.Insert(4);
         Tree.Insert(6);
         Tree.Insert(3);
         Tree.Search(4);
         Tree.Search(6);
         Tree.Search(3);
         Tree.Inorder();
         Tree.PostOrder();
        //Tree.Insertion(6);
        //Tree.Insertion(4);
        //System.out.println(Tree.root.right.data);
        //System.out.println(Tree.root.left.data);
        //Tree.Search(6);
        
        
        
        
        
        
        
    }
    
}
