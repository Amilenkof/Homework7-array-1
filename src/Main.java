import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        //("Задача 1.");
/*Объявите три массива:

Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.*/
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        /*Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.*/
        double[] secondArray = {1.57, 7.654, 9.986};
/*Произвольный массив. Тип и
 количество данных определите сами. Самостоятельно выберите способ создания массива:
 с помощью ключевого слова или сразу заполненный элементами.*/
        int[] thirstArray = {10, 20, 38, 3214, 5411, 996, 4127, 8};
    }

    public static void task2() {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirstArray = {10, 20, 38, 3214, 5411, 996, 4127, 8};

        System.out.println("Задача 2.");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();

        for (int k = 0; k < secondArray.length; k++) {
            System.out.print(secondArray[k] + " ");
        }
        System.out.println();
        for (int j = 0; j < thirstArray.length; j++) {
            System.out.print(thirstArray[j] + " ");
        }
        System.out.println();
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки
         запятую ставить не надо.*/
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirstArray = {10, 20, 38, 3214, 5411, 996, 4127, 8};
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }

        System.out.println();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println();

        for (int i = thirstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(thirstArray[i]);
                break;
            }
            System.out.print(thirstArray[i] + ", ");
        }
        System.out.println();
    }

   /* Задача 4
    Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
            Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
            Распечатайте результат преобразования в консоль.*/

    public static void task4() {
        System.out.println("Задача 4.");
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirstArray = {10, 20, 38, 3214, 5411, 996, 4127, 8};
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
            } else {
                firstArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}

