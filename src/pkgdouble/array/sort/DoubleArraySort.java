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
        int[] masyvas = {1, 2, 3, 4, 5};
        int[][] doubleMasyvas= new int[masyvas.length][masyvas.length];
        int offset = 0;
        // numbers move from left to right one number in a line
        for (int i = 0; i < doubleMasyvas.length; i++, offset++) {
            int[] line = doubleMasyvas[i];
            for (int j = 0; j < line.length; j++) {
                int temp = offset;
                if (temp + j > line.length - 1)
                    
                    temp -= line.length;
                    line[j] = masyvas[temp + j];
                    System.out.print(line[j]);
                    
                
            }
            System.out.println("");
            
        }
        // numbers move from right to left one number in a line
//        for (int i = 0; i < doubleMasyvas.length; i++, offset--) {
//            int[] line = doubleMasyvas[i];
//            for (int j = 0; j < line.length; j++) {
//                int temp = offset;
//                if (temp + j < 0)
//                    temp += line.length;
//                    line[j] = masyvas[temp + j];
//                    System.out.print(line[j]);
//            }
//            System.out.println("");
//        }
    }
}
