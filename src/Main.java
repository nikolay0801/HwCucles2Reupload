import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        System.out.println(" Задача 1 ");

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) { //
            i = i + 1; //Увеличиввем сумму накоплений с первого месяца
            total = total + salary;
            System.out.println("\n " + "Месяц " + i + " Сумма накоплений за месяц " + total);
        }
    }

    private static void task2() {
        System.out.println(" Задача 2 "); // пример через цикл while

        int i = 0;
        while (i <= 10) {
            System.out.println("\n" + i);
            i++;
        }
    }

    private static void task3() {
        System.out.println(" Задача 2 ");//Пример через цикл for на понижение цифр от 10 до 0.

        int i = 10;
        for (; i >= 0; i--) { // исправил,теперь понял какой символ поствить, чтобы вывод в консоле был с 0.
            System.out.println("\n" + i);
        }
    }

    private static void task4() {
        System.out.println(" Задача 3 ");
        int population = 12_000_000;
        int beBorn = 17;// на каждую 1000 чловек, рождаеться 17.
        int death = 8; // на каждую 1000 человк умирает 8.
        int dif = beBorn - death;// находим разницу между смертностью и рождением
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000; //находим разницу популяции численности населения
            System.out.println("\n " + "За " + i + " Год " + "численность населения составляет " + population);
        }
    }

    private static void task5() {
        System.out.println(" Задача 4 ");

        int salary = 12000;
        int total = 0;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + total * 7 / 100; // Сумма вклада с % за каждый месяц.
            total = total + salary;
            System.out.println("\n " + "Сумма накоплений за " + i + " месяц'а' " + "равна " + total);
        }
        System.out.println(total);
    }

    private static void task6() {
        System.out.println(" Задача 5");
        int salary = 12000;
        int total = 0;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + total * 7 / 100; // Сумма вклада с % за каждый месяц.
            total = total + salary;
            if (i % 6 == 0) { // Добавили операци, для выделения месяцев подсчета.
                System.out.println("\n " + "За каждый " + i + " Месяц'а " + " Сумма накоплений равна " + total);
                System.out.println(total);
            }
        }
    }

    private static void task7() {

        System.out.println(" Задача 6");

        int salary = 12000;
        int total = 0;
        int i = 1;
        for (; i <= 9 * 12; i++) {
            total = total + total * 7 / 100; // Сумма вклада с % за каждый месяц.
            total = total + salary;
            if (i % 6 == 0) { // Добавили операци, для выделения месяцев подсчета.
                System.out.println("\n " + "За каждый " + i + " Месяц'а " + " Сумма накоплений равна " + total);
                System.out.println(total);
            }
        }
    }

    private static void task8() {
        System.out.println(" Задача 7");

        int totalDays = 31;
        int i = 3; // Заменил значение 5 на 3, чтобы наглядно увидеть, что 31 число наглядно выведеться в консоль.
        for (; i <= totalDays; i = i + 7) { // Так же тут добавил символ <= , чтобы программа считала значение,
            // Если число выпадет на 31, то оно его покажет.
            System.out.println("\n" + "Сегодня пятница  " + i + " -е число. Необходимо подготовить отчет ");
        }
    }

    private static void task9() {
        System.out.println(" Задача 8");

        int maxInterval = LocalDate.now().getYear();
        // Определяем текущий год и ложим времено в переменную maxInterval.
        // Пользовался библиотекой java. ( подсказал друг)
        int minInterval = maxInterval - 200;
        maxInterval += 100;
        for (int i = 0; i < maxInterval; i += 79) {
            if (i >= minInterval) {
                System.out.println("\n" + i);
            }
        }
    }
}



