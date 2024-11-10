public class hw_9 {
    public static void main(String[] args) {
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName;
        fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // task 2
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameToUpperCase);

        // task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("fullName = " + fullName);
    }
}
