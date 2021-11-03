import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    private static int[] getRandomFilledArray(int arraySize) {
        return IntStream.range(0, arraySize)
                .map(i -> (int) (Math.random() * arraySize) - (arraySize / 2))
                .toArray();
    }

    private static int[][] getStepMatrix(int rowSize) {
        int[][] matrix = new int[rowSize][];
        for (int i = 0; i < matrix.length; i++) {
            int arraySize = (int) (Math.random() * (rowSize - 1)) + 1;
            matrix[i] = getRandomFilledArray(arraySize);
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    private static void printNegativeElements(int[][] matrix) {
        Arrays.stream(matrix)
                .map(array -> Arrays.stream(array).filter(i -> i < 0).toArray())
                .filter(array -> array.length > 0)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[][] stepMatrix = getStepMatrix(6);

        Arrays.stream(stepMatrix)
                .forEach(Arrays::sort);
        printMatrix(stepMatrix);

        System.out.println("Negative:");
        printNegativeElements(stepMatrix);
    }
}
