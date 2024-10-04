public class hw_5 {
    public static void main(String[] args) {
        // task 1
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // task 3
        for (int i = 2; i < 18; i = i + 2) {
            System.out.println(i);
        }

        // task 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        // task 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // task 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // task 8
        for (int i = 1, total = 0; i < 13; i = i + 1) {
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // task 9
        for (int i = 1, total = 0; i < 13; i = i + 1) {
            total = total + total/100;
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // task 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }
}
