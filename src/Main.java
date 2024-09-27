public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);

        //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);

        // task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);

        // task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса бойцов " + totalWeight + " кг!");
        var totalDifferenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница масс бойцов " + totalDifferenceWeight + " кг!");

        // task 7
        var remainderDivisionWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(remainderDivisionWeight);

        // task 8
        var totalTime = 640;
        var everyEmployee = 8;
        var countEmployee = totalTime / everyEmployee;
        System.out.println("Всего работников в компании — " + countEmployee + " человек");

        var secondCount = countEmployee + 94;
        var secondWorkTime = 640 / secondCount;
        System.out.println("Если в компании работает " + secondCount + " человек, то всего " + secondWorkTime + " часа работы может быть поделено между сотрудниками");
    }
}