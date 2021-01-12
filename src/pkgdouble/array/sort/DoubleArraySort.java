/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.array.sort;

/**
 *
 * @author 37067
 */
public class DoubleArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] doubleArray= new int[array.length][array.length];
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
            // moves from right to left
//                doubleArray[i][j] = array[(i + j) % array.length];
            // moves from felt to right
                doubleArray[i][(i + j) % array.length] = array[j];
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            int[] line = doubleArray[i];
            for (int j = 0; j < line.length; j++) {
                int element = line[j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
