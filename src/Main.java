public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа 9.");
            task1();
            task2();
            task3();
            task4();
        }
         // Объявить метод «сгенерироватьМассив»
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

        public static void task1 () {
            System.out.println("Задача 1");
         // Пишем код для задачи 1
            int[] arr = generateRandomArray();
            int totalExpenses = 0;
            for (int expense : arr) {
                totalExpenses += expense;
                System.out.print(expense + " ");
            }
            System.out.println();
            System.out.println("Общая сумма расходов за месяц: " + totalExpenses + " рублей");
        }

        public static void task2 () {
            System.out.println("Задача 2");
         // Пишем код для задачи 2
            int[] expenses = generateRandomArray();
            int maxExpense = expenses[0];
            int minExpense = expenses[0];
            System.out.print(expenses[0] + " ");
            for (int i = 1; i < expenses.length; i++) {
                System.out.print(expenses[i] + " ");
                if (expenses[i] > maxExpense) {
                    maxExpense = expenses[i];
                }
                if (expenses[i] < minExpense) {
                    minExpense = expenses[i];
                }
            }
            System.out.println();
            System.out.println("Максимальная сумма расходов за день: " + maxExpense);
            System.out.println("Минимальная сумма расходов за день: " + minExpense);
        }
        public static void task3 () {
            System.out.println("Задача 3");
         // Пишем код для задачи 3
            int[] expenses = generateRandomArray();
            int totalExpenses = 0;

            for (int expense : expenses) {
                totalExpenses += expense;
                System.out.print(expense + " ");
            }
            double averageExpense = (double) totalExpenses / 30;
            System.out.println();
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", averageExpense);

        }

        public static void task4 () {
            System.out.println("Задача 4");
        // Пишем код для задачи 4
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int i = reverseFullName.length - 1; i >=0; i--) {
                System.out.print(reverseFullName[i]);
            }
    }
}