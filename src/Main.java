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

        }

        public static void task2 () {
            System.out.println("Задача 2");
         // Пишем код для задачи 2

        }
        public static void task3 () {
            System.out.println("Задача 3");
         // Пишем код для задачи 3

        }

        public static void task4 () {
            System.out.println("Задача 4");
        // Пишем код для задачи 4

    }
}