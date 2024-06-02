public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Task 1 ");

        int[] numbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] myNumbers = {27, 322, 88};

        System.out.println("Task 2 ");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i == fractionalNumbers.length - 1) {
                System.out.print(fractionalNumbers[i]);
            } else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < myNumbers.length; i++) {
            if (i == myNumbers.length - 1) {
                System.out.print(myNumbers[i]);
            } else {
                System.out.print(myNumbers[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 3 ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractionalNumbers[i]);
            } else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();

        for (int i = myNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myNumbers[i]);
            } else {
                System.out.print(myNumbers[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
            System.out.print(numbers[i] + " ");
        }

    }
}
