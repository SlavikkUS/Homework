package HomeworkEight;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public abstract class Service extends Card {
    private Scanner scanner = new Scanner(System.in);

    Service(int money, String password) {
        super(money, password);
    }

    public void enterPassword() throws InterruptedException {
        System.out.println("One moment, you will get a new password:");
        TimeUnit.MILLISECONDS.sleep(1000);
        Random random = new Random();
        password = String.format("%04d", random.nextInt(10000));
        System.out.println(password);
        System.out.println("Enter your password:");
        for (int i = 2; i >= 0; i--) {
            try {
                String input = scanner.nextLine();
                if (input.length() == password.length()) {
                    if (input.equals(password)) {
                        System.out.println("Right password! \nGood day mr.Anderson, you use a Debit HomeworkEight.Card.");
                        break;
                    }
                } else scanner.close();
            } catch (IllegalStateException e) {
                System.out.println("Wrong password, try again!");
                scanner.close();
            }
        }
    }

    public int refillCard() {
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                money = scanner.nextInt();
                sum = sum + money;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("Finish operation")) {
                    isExit = true;
                }
            }
        }
        return sum;
    }

    public void paymentProcessForDebitCard(int balance) {
        money = scanner.nextInt();
        if (balance - money < 0) {
            System.out.println("You use a debit card, don't forget top up your account:");
            System.out.println(balance - money);
        } else
            System.out.println(balance - money);
    }

    public void paymentProcessForOverdraftCard(int balance) {
        money = scanner.nextInt();
        try {
            if (balance - money > 0) {
                System.out.println(balance - money);
            } else {
                System.out.println("Remember!\nYou use a Overdraft HomeworkEight.Card, balance can not be less zero!");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}


