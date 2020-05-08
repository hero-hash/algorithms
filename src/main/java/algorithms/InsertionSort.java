package algorithms;

public class InsertionSort {

    /***
     *
     * @param sequence a sequence of numbers
     * @return a permutation of the input sequence such that each number is less than the next one
     */
    public static int[] quickSort(int[] sequence) {
        for (int j = 1; j < sequence.length; j++) {
            int key = sequence[j];
            int i = j - 1;
            while (i >= 0 && sequence[i] > key) {
                sequence[i + 1] = sequence[i];
                i = i - 1;
                sequence[i + 1] = key;
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
       int[] result =  quickSort(new int[]{42,23,16,15,8,4});
    }
}
