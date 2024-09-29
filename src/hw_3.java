public class hw_3 {
    public static void main(String[] args) {
        // task 1
        byte age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        byte temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // task 3
        byte speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // task 4
        byte ageHuman = 25;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете.");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу.");
        }

        // task 5
        byte ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6
        byte capacity = 102;
        byte seating = 60;
        byte currentPassagers = 60;
        if (currentPassagers > capacity) {
            System.out.println("Вагон полностью забит.");
        } else {
            if (currentPassagers > seating) {
                System.out.println("Сидячих свободных мест нет.");
            } else {
                System.out.println("Есть свободные сидячие места.");
            }
        }

        // task 8
        int one = 0;
        int two = 1;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше всего!");
        } else {
            if (two > one && two > three) {
            System.out.println("Число " + two + " больше всего!");
            } else {
                if (three > one && three > two) {
                    System.out.println("Число " + three + " больше всего!");
                }
            }
        }
    }
}
