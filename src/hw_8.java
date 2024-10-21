public class hw_8 {
    public static void main(String[] args) {
        // task 1
        int[] payments = {50000, 60000, 40000, 30000, 100000};
        int totalSumOfPayments = 0;
        for (int payment : payments) {
            totalSumOfPayments += payment;
        }
        System.out.println("Сумма трат за месяц составила " + totalSumOfPayments + " рублей");

        // task 2
        int[] payments1 = {55000, 65000, 45000, 35000, 105000};
        int maxPayment = -1;
        int minPayment = payments1[0];
        for (int payment : payments1) {
            if (payment > maxPayment && payment > minPayment) {
                maxPayment = payment;
            } else if (payment < maxPayment && payment < minPayment) {
                minPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        // task 3
        int[] payments2 = {5000, 7000, 10000, 35000, 8700};
        float totalPaymentOfMonth = 0;
        for (int payment : payments2) {
            totalPaymentOfMonth += payment;
        }
        float totalExpenses = totalPaymentOfMonth / payments2.length;
        System.out.println("Средняя сумма трат за месяц составила " + totalExpenses + " рублей");

        // task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int oneChar = 0; oneChar < reverseFullName.length / 2; oneChar++) {
            char tempIndex = reverseFullName[oneChar];
            reverseFullName[oneChar] = reverseFullName[reverseFullName.length - oneChar - 1];
            reverseFullName[reverseFullName.length - oneChar - 1] = tempIndex;
        }
        System.out.println(String.valueOf(reverseFullName)); // как надо было это делать без гугла..
    }
}