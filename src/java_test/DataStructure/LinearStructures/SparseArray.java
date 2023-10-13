package java_test.DataStructure.LinearStructures;

import java.util.Arrays;

/**
 * 稀疏数组
 * 疎行列
 * */
public class SparseArray {
    public int[][] mArray = new int[11][11];
    public SparseArray() {
        mArray[1][2] = 1;
        mArray[2][3] = 2;
    }

    public void showArray(int[][] array){
        for (int[] row : array) {
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }

    public int[][] toSparseArray(){
        int[][] array = mArray;
        int sum = 0;
        for (int[] row : array) {
            for (int data :row) {
                if (data != 0) {
                    sum++;
                }
            }
        }

        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = sum;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }
        return sparseArray;
    }

    public int[][] toArray(int[][] array){
        int[][] newArray = new int[array[0][0]][array[0][1]];
        for (int i = 1; i < array.length; i++) {
            newArray[array[i][0]][array[i][1]] = array[i][2];
        }
        return newArray;
    }
    public <T> void ArrayToSparseArray(T[][] array){

    }

    public static void main(String[] args) {
        SparseArray sparseArray = new SparseArray();
        int[][] sparse = sparseArray.toSparseArray();
        sparseArray.showArray(sparseArray.toArray(sparse));
    }
}
