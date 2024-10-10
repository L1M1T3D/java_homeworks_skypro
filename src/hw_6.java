public class hw_6 {
    public static void main(String[] args) {
        // task 1
        int totalSum = 0;
        int depositAmount = 15000;
        int months = 0;
        while (totalSum < 2_459_000) {
            months++;
            totalSum += depositAmount;
        }
        System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSum + " рублей");

        // task 2
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (num = 10; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.println();

        // task 3
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            int births = population * birthRate / 1000;
            int deaths = population * mortalityRate / 1000;
            population = population + births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // task 4
        int percent = 7;
        int depositStart = 15000;
        totalSum = 12_000_000;
        int month = 1;
        while (depositStart < totalSum) {
            depositStart = depositStart + (depositStart * percent / 100);
            System.out.println("Месяц " + month + ", сумма накопления " + depositStart);
            month++;
        }

        // task 5
        depositStart = 15000;
        month = 1;
        while (depositStart < totalSum) {
            depositStart = depositStart + (depositStart * percent / 100);
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сумма накопления " + depositStart);
            }
            month++;
        }

        // task 6
        int yearsOfSavings = 9;
        depositStart = 15000;
        month = 1;
        int halfOfYear = 1;
        while (month <= (yearsOfSavings * 12)) {
            depositStart = depositStart + (depositStart * percent / 100);
            if (month % 6 == 0) {
                System.out.println("Полугодие " + halfOfYear + ", сумма накопления " + depositStart);
                halfOfYear++;
            }
            month++;
        }

        // task 7
        int friday = 1;
        int days = 31;
        while (friday <= days) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        // task 8
        int yearWithStar = 79;
        int currentYear = 2024;
        int firstYear = currentYear - 200;
        int secondYear = currentYear + 100;
        int year = 0;
        while (year <= secondYear) {
            if (year > firstYear) {
                System.out.println(year);
            }
            year += 79;
        }
    }
}
