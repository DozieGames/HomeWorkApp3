import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        replaceNumbers();
        System.out.println("-------------------");
        zapolnitelCiklov();
        System.out.println("-------------------");
        System.out.println("-------------------");
        delitelMenishihNumbers();
        System.out.println("-------------------");
        zapolnenieDiagonaley();
        System.out.println("-------------------");
        chislovoyPoradok(5, 2);
        System.out.println("-------------------");
        System.out.println("-------------------");
        int[] array = {1, 2, 6, -5, -2, 2};
        finderMinAndMax(array);
        System.out.println("-------------------");
        int[] array2 = {1, 1, 1, 1};
        System.out.println(checkBalance(array2));
        System.out.println("-------------------");
        peremeshenieChisel(new int[] { 1, 2, 3, 4, 5, 6}, -2);

        System.out.println("МАНАЛ В РОТ ЭТО ЗАДАНИЕ ЕСЛИ ЧЕСТНО, Я ПРЕДПОСЛЕДНЕЕ В ДВЕ ЗВЁЗДОЧКИ СДЕЛАЛ ЗА МИНУТ 15-20 А ПОСЛЕДНИЕ В ТРИ ЗВЁЗДОЧКИ 2-3");
        System.out.println("СМЕРТЬ");

    }


    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void replaceNumbers() {

        int[] numbers = {1, 1, 0, 0, 1, 1,};
        int maxNumbers = numbers.length;

        for (int i = 0; i < maxNumbers; i++) {
        }
        for (int i = 0; i < maxNumbers; i++)
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else numbers[i] = 1;
        for (int i = 0; i < maxNumbers; i++) {
            System.out.println(numbers[i]);
        }
    }


    /**
     * Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    public static void zapolnitelCiklov() {
        int arrayint[] = new int[100];
        String arrayString[] = new String[1];
        Arrays.fill(arrayint, 1);
        Arrays.fill(arrayString, "1");
        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = i + 1;
        }
        System.out.print(Arrays.toString(arrayint));
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;
     */


    public static void delitelMenishihNumbers() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxNumbers = numbers.length;

        for (int i = 0; i < maxNumbers; i++) {
            if (numbers[i] >= 6) {
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i] * 2);
            }
        }
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void zapolnenieDiagonaley() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
            //БЛИН, ОНО РАБОТАЕТ, ЭТО ПИПЕЦ КАКОЙ ТО.
        }
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue;
     */


    public static void chislovoyPoradok(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    /**
     * * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */

    public static void finderMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }

    /**
     * ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     */

    public static boolean checkBalance(int[] array2) {
        int leftSumm = 0;
        int rightSumm = 0;
        for (int i = 0; i < array2.length; i++) {
            rightSumm += array2[i];
        }

        for (int i = 0; i < array2.length; i++) {
            leftSumm += array2[i];
            if (leftSumm == rightSumm - leftSumm) {
                return true;
            }
        }
        return false;
    }

    /**
     * *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     *
     * @return
     */

    static void peremeshenieChisel(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
//МАНАЛ В РОТ ЭТО ЗАДАНИЕ ЕСЛИ ЧЕСТНО, Я ПРЕДПОСЛЕДНЕЕ В ДВЕ ЗВЁЗДОЧКИ СДЕЛАЛ ЗА МИНУТ 15-20 А ЭТО ЗА ЧАСА 2-3
//СМЕРТЬ...