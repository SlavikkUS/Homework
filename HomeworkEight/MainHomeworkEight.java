package HomeworkEight;

public class MainHomeworkEight {
    public static void main(String[] args) throws Exception {
        DebitCard debitCard = new DebitCard(100_000, "3453");
        OverdraftCard overdraftCard = new OverdraftCard(130_000, "2343");
        debitCard.enterPassword();
        System.out.println(debitCard.refillCard());
        debitCard.paymentProcessForDebitCard(debitCard.refillCard());
        overdraftCard.enterPassword();
        System.out.println(overdraftCard.refillCard());
        overdraftCard.paymentProcessForOverdraftCard(debitCard.refillCard());
    }
}
