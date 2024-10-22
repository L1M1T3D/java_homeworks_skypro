public class hw_2 {
    public static void main(String[] args) {
        // task 1
        int a = 100000;
        System.out.println("Значение переменной `a` с типом int равно " + a);
        byte b = 127;
        System.out.println("Значение переменной `b` с типом int равно " + b);
        short c = 128;
        System.out.println("Значение переменной `c` с типом int равно " + c);
        long d = 1000L;
        System.out.println("Значение переменной `d` с типом int равно " + d);
        float e = 3.5f;
        System.out.println("Значение переменной `e` с типом int равно " + e);
        double f = 3.4565788943;
        System.out.println("Значение переменной `f` с типом int равно " + f);

        // task 2
        float a1 = 27.12f;
        long b2 = 987678965549L;
        float c3 = 2.786f;
        short d4 = 569;
        short e5 = -159;
        short f6 = 27897;
        byte g7 = 67;
        System.out.println(a1 + " " + b2 + " " + c3 + " " + d4 + " " + e5 + " " + f6 + " " + g7);

        // task 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short piecesPaper = 480;
        int countOfPaperEveryStudent = piecesPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + countOfPaperEveryStudent + " листов бумаги");

        // task 4
        byte bottles = 16;
        byte minutes = 2;
        int bottlesPerMin = bottles / minutes;
        int bottlesPerTwentyMin = bottlesPerMin * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMin + " штук бутылок");
        int bottlesPerOneDay = bottlesPerMin * (24 * 60);
        System.out.println("За 1 день машина произвела " + bottlesPerOneDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerMin * (24 * 60 * 3);
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerOneMonth = bottlesPerMin * (24 * 60 * 30);
        System.out.println("За 1 месяц машина произвела " + bottlesPerOneMonth + " штук бутылок");

        // task 5
        byte cansOfPaint = 120;
        byte whiteCanForClass = 2;
        byte brownCanForClass = 4;
        int countOfClasses = cansOfPaint / (whiteCanForClass + brownCanForClass);
        int canOfWhitePaint = whiteCanForClass * countOfClasses;
        int canOfBrownPaint = brownCanForClass * countOfClasses;
        System.out.println("В школе, где " + countOfClasses + " классов, нужно " + canOfWhitePaint + " банок белой краски и " + canOfBrownPaint + " банок коричневой краски");

        // task 6
        byte bananas = 5;
        byte grOfBananas = 80;
        short milk = 200;
        byte grOfMilk = 105;
        byte iceCream = 2;
        byte grOfIceCream = 100;
        byte eggs = 4;
        byte grOfEggs = 70;
        int totalWeightInGr = (grOfEggs * eggs) + (grOfBananas * bananas) + (grOfMilk * milk) + (grOfIceCream * iceCream);
        System.out.println(totalWeightInGr);
        int grPerKg = 1000;
        float totalWeightInKg = totalWeightInGr / (float)grPerKg;
        System.out.println(totalWeightInKg);

        // task 7
        byte weightToCategoryInKg = 7;
        int weightToCategoryInGr = weightToCategoryInKg * 1000;
        short weightEveryDayFor250Gr = 250;
        short weightEveryDayFor500Gr = 500;
        int totalWeightIf250GrPerDay = weightToCategoryInGr / weightEveryDayFor250Gr;
        System.out.println(totalWeightIf250GrPerDay);
        int totalWeightIf500GrPerDay = weightToCategoryInGr / weightEveryDayFor500Gr;
        System.out.println(totalWeightIf500GrPerDay);
        int avgToLoseWeight = (totalWeightIf500GrPerDay + totalWeightIf250GrPerDay) / 2;
        System.out.println(avgToLoseWeight);

        // task 8
        float upToSalary = 0.1f;
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        int salaryInYearBeforeMasha = salaryOfMasha * 12;
        int salaryInYearBeforeDenis = salaryOfDenis * 12;
        int salaryInYearBeforeKristina = salaryOfKristina * 12;
        float salaryAfterMasha = salaryOfMasha * upToSalary + salaryOfMasha;
        float salaryAfterDenis = salaryOfDenis * upToSalary + salaryOfDenis;
        float salaryAfterKristina = salaryOfKristina * upToSalary + salaryOfKristina;
        float salaryInYearAfterMasha = salaryAfterMasha * 12;
        float salaryInYearAfterDenis = salaryAfterDenis * 12;
        float salaryInYearAfterKristina = salaryAfterKristina * 12;
        float differenceSalaryOfMasha = salaryInYearAfterMasha - salaryInYearBeforeMasha;
        float differenceSalaryOfDenis = salaryInYearAfterDenis - salaryInYearBeforeDenis;
        float differenceSalaryOfKristina = salaryInYearAfterKristina - salaryInYearBeforeKristina;
        System.out.println("Маша теперь получает " + salaryAfterMasha + " рублей. Годовой доход вырос на " + differenceSalaryOfMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterDenis + " рублей. Годовой доход вырос на " + differenceSalaryOfDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterKristina + " рублей. Годовой доход вырос на " + differenceSalaryOfKristina + " рублей");
    }
}
