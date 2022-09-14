public class GenericMethodTest {
    public static < E > void  printArray(E[] inputArray) {
        for (E ins : inputArray) {
            System.out.printf("%s ", ins);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        printArray(intArray);
        System.out.println("-------");
        printArray(doubleArray);
        System.out.println("-------");
        printArray(charArray);
    }

}
