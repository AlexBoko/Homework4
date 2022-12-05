public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age == 18) {
            System.out.println("Если возраст человека равен 18 он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше 18 он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 2;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость больше 60 км/часм, то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость меньше 60 км/час, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад. ");
        } else {
            if (age1 >= 7 && age1 <= 18) {
                System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу. ");
            } else {
                if (age1 > 18 && age1 <= 24) {
                    System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете. ");
                } else {
                    if (age1 > 24) {
                        System.out.println("А если человеку больше 24, то ему пора ходить на работу. ");
                    }
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageСhild = 20;
        if (ageСhild < 5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе. ");
        } else {
            if (ageСhild > 5 && ageСhild <= 14) {
                System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя. ");
            } else {
                if (ageСhild > 14) {
                    System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
                }
            }
        }
    }


    public static void task6 () {
        System.out.println("Задача 6");
        int trainСar = 102;
        int seating = 40;
        if (trainСar >= 102 && seating >= 60) {
            System.out.println("Вагон уже полностью забит ");
        } else {
            if (trainСar <= 102 && seating == 60) {
                System.out.println("В вагоне есть стоячие места ");
            } else {
                if (trainСar == 102 && seating <= 60) {
                    System.out.println("В вагоне есть сидячие места ");
                }
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two && three > one) {
            System.out.println("Three больше чем two и one ");
        } else {
            if (three < two || three <= one) {
                System.out.println("Three меньше чем two и меньше либо ровно one ");
            }
        }


    }}