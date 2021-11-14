package course04;

public class GenericMethodTest {


    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.2, 2.3, 4.6};
        Character[] charArray={'A', 'L', 'E'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
