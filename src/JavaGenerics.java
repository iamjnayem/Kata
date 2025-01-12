public class JavaGenerics {
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {

        String[] stringArray = {"Hello", "World"};
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);
        printArray(stringArray);
    }
}
