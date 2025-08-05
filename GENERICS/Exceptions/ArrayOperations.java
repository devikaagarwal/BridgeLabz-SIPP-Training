package GENERICS.Exceptions;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = null;
        int index = 5;
        try {
            numbers = new int[]{10, 20, 30};
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

