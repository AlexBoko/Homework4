public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18 он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше 18 он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 4;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость больше 60 км/часм, то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость меньше 60 км/час, то можно ездить спокойно");
        }



}}