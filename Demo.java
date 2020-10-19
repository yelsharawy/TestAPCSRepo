public class Demo {

    public static void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int testVal = args.length == 0 ? 5 : Integer.parseInt(args[0]);
        printLoop(testVal);
    }

}
