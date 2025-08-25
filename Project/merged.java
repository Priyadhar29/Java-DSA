package Project;
import java.util.Scanner;
public class merged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of first array (ascending order)
        int N = scanner.nextInt();
        int[] A1 = new int[N];
        for (int i = 0; i < N; i++) {
            A1[i] = scanner.nextInt();
        }

        // Read size of second array (descending order)
        int M = scanner.nextInt();
        int[] A2 = new int[M];
        for (int i = 0; i < M; i++) {
            A2[i] = scanner.nextInt();
        }
        
        int[] mergedArray=mergeSort(A1,A2);
        for(int i=0;i<mergedArray.length;i++) {
        	System.out.print(mergedArray[i]+" ");
        }
    }
     public static int[] mergeSort (int[]A1, int[]A2) {
        // Merge logic: A1 is ascending, A2 is descending
    	int N=A1.length,M=A2.length;
        int[] mergedArray = new int[N + M];
        int i = N-1;          // Pointer for A1 (start)
        int j = M - 1;      // Pointer for A2 (end, to go from largest to smallest)
        int k = 0;          // Pointer for mergedArray

        while (i >=0 && j >= 0) {
            if (A1[i] <= A2[j]) {
                mergedArray[k++] = A1[i--];
            } else {
                mergedArray[k++] = A2[j--];
            }
        }

        // Remaining elements from A1
        while (i >=0) {
            mergedArray[k++] = A1[i--];
        }

        // Remaining elements from A2
        while (j >= 0) {
            mergedArray[k++] = A2[j--];
        }

        return mergedArray;
    }
}
