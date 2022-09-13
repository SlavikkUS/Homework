package Task12;

/*
 *
 *
 * author Usenkov Slava;
 */
public class Task20 {

    public static void main(String[] args) {

        findAmountLuckyTickets();
    }

    private static void findAmountLuckyTickets() {
        int number = 0;
        for (int i = 0; i < 999_999; i++) {
            int number6 = i % 10;
            int number5 = i / 10 % 10;
            int number4 = i / 100 % 10;
            int number3 = i / 1000 % 10;
            int number2 = i / 10000 % 10;
            int number1 = i / 100000;
            if ((number1 + number2 + number3) == (number4 + number5 + number6)) {
                number++;
            }
        }
        System.out.print("Количество счастливых билетов в одном рулоне составляет: " + number);
    }
}
