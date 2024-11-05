import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //задача 1.
        int[] first = new int[]{1, 2, 3};

        double[] number = new double[]{1.57, 7.654, 9.986};

        int[] arr = new int[]{10, 12, 15};


        System.out.println("Задача.3");


        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("задача2");
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ",");
        }
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ",");
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println("Задача4");
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] = first[i] + 1;
            }
        }
        System.out.print(Arrays.toString(first));

    }
}