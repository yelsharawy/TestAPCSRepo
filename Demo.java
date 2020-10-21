public class Demo {

    public static void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static String arrToString(int[] arr) {
        if (arr.length == 0) return "{}";

        StringBuilder output = new StringBuilder(3 * arr.length).append('{');
                            // approximate length ^ for less resizes
        output.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            output.append(", ");
            output.append(arr[i]);
        }

        return output.append('}').toString();
    }

    public static String arrDeepToString(int[][] arr) {
        if (arr.length == 0) return "{}";

        StringBuilder output = new StringBuilder().append('{');

        output.append(arrToString(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            output.append(", ");
            output.append(arrToString(arr[i]));
        }

        return output.append('}').toString();
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] output = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                output[r][c] = (int)(Math.random() * (maxValue + 1));
            }
        }

        return output;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] output = new int[rows][];

        for (int r = 0; r < rows; r++) {
            int rowLength = (int)(Math.random() * (cols + 1));
            output[r] = new int[rowLength];

            for (int c = 0; c < rowLength; c++) {
                output[r][c] = (int)(Math.random() * (maxValue + 1));
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int testVal = args.length == 0 ? 5 : Integer.parseInt(args[0]);
        printLoop(testVal);
    }

}
