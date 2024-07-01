public class Array {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Iterating over the array
        System.out.println("Elements of the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Multi-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Element at second row, third column: " + matrix[1][2]);
    }
}
