package HomeworkEight;

public class MainHomeworkEight {
    public static void main(String[] args) throws Exception {
        Card debitCard = new Card(CardType.DEBIT, 100.0, "1234");
        ATM atm = new ATM();

        atm.withdrawMoney(debitCard);
        atm.topUp(debitCard);
        System.out.println(debitCard.getMoney());

        Card overdraftCard = new Card(CardType.OVERDRAFT, 100.0, "1234");
        atm.withdrawMoney(overdraftCard);
        atm.topUp(overdraftCard);
        System.out.println(overdraftCard.getMoney());
    }

}