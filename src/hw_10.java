import java.time.LocalDate;

public class hw_10 {
    public static void checkingLeapYear(int year) {
        // for task 1
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год меньше 1584 не может быть високосным или не високосным");
        }
    }

    public static void printInfoAboutInstallation(byte clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculateDaysForDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void main(String[] args) {
        // task 1
        int year = 1583;
        checkingLeapYear(year);

        // task 2
        byte clientOS = 0; // ios = 0, android = 1
        short clientDeviceYear = 2021;
        printInfoAboutInstallation(clientOS, clientDeviceYear);

        // task 3
        byte deliveryDistance = 25;
        calculateDaysForDelivery(deliveryDistance);
    }
}
