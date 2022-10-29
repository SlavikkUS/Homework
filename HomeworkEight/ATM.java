package HomeworkEight;

import java.util.Objects;
import java.util.Scanner;

public class ATM {
    public Scanner scanner = new Scanner(System.in);

    public void topUp(Card card) {
        try {
            checkPin(card);
        } catch (myOwnExeption e) {
            System.out.println("Pin is incorrect");
            return;
        }

        System.out.println("Provide top up sum.");
        String sum = scanner.nextLine();
        Double sum1 = Double.valueOf(sum);
        if (sum1 <= 0) {
            System.out.println("Top up can't be 0 or less then 0.");
            return;
        } else {
            card.setMoney(card.getMoney() + sum1);
        }
    }

    public void withdrawMoney(Card card) {
        try {
            checkPin(card);
        } catch (myOwnExeption e) {
            System.out.println("Pin is incorrect");
            return;
        }

        System.out.println("Provide withdraw sum.");
        String sum = scanner.nextLine();
        Double sum1 = Double.valueOf(sum);
        if (card.getCardType().equals(CardType.DEBIT) && card.getMoney() < sum1) {
            System.out.println("You don't have enough money");
            return;
        } else {
            card.setMoney(card.getMoney() - sum1);
        }
    }

    public void checkPin(Card card) throws myOwnExeption {
        System.out.println("Please provide pin.");
        String pin = scanner.nextLine();
        if (!Objects.equals(card.getPin(), pin)) {
            throw new myOwnExeption("Incorrect Pin ");
        }
    }
}

